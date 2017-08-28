package com;

import java.io.IOException;
import java.sql.Connection;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.app.controller.Context;
import com.app.controller.Controller;
import com.app.controller.ControllerFactory;
import com.app.view.NotFound404Layout;

public class Servlet extends HttpServlet {

	private DataSource _ds;
	
	@Override
	public void init() throws ServletException {
		try {
			_ds = (DataSource)new InitialContext().lookup("java:/comp/env/jdbc/seminar");
		} catch (NamingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		for(Controller c : ControllerFactory.controllers()){
			if(c.handles(req.getRequestURI())){
				try {
					Connection connection = _ds.getConnection();
					connection.setAutoCommit(false);
					c.execute(new Context(req, resp, connection));
					connection.commit();
					connection.close();
					return;
				} catch (Exception e) {
					resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					throw new RuntimeException(e);
				} 
			}
		}
		resp.setContentType("text/html;charset=UTF-8");
		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		resp.getWriter().write(new NotFound404Layout().build().render());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			doGet(req, resp);
		} catch (ServletException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
