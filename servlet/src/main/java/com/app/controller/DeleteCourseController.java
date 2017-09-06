package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.database.SQLiteJDBC;

public class DeleteCourseController implements Controller {

	@Override
	public boolean handles(String route) {
		return route.matches("/course/delete/\\d+");
	}

	@Override
	public void execute(Context context) throws Exception {
		HttpServletRequest request = context.request();
		HttpServletResponse response = context.response();

		String[] path = context.request().getRequestURI().split("/");
		
		SQLiteJDBC.getInstance().delete(context.connection(), path[3]);
		response.sendRedirect("/course");

	}

}
