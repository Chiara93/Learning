package com.app.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Course;
import com.app.model.Seminar;
import com.app.view.CreateCourseLayout;

public class CreateCourseController implements Controller{
	
	public static List<Seminar> seminars = new ArrayList<>();
	@Override
	public boolean handles(String route) {
		return "/course/create".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		HttpServletRequest request = context.request();
		HttpServletResponse response = context.response();
		
		if("GET".equals(request.getMethod())) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.getWriter().write(new CreateCourseLayout().build().render());
		} else if("POST".equals(request.getMethod())) {
			Course course = new Course(request.getParameter("name"), Integer.parseInt(request.getParameter("number")), request.getParameter("description"));
			Seminar seminar = new Seminar(course, request.getParameter("location"), new Date(117, 2, 25)/*Date.valueOf(request.getParameter("date"))*/, Integer.parseInt(request.getParameter("seats")));
			if(seminars.add(seminar)) {
				response.sendRedirect("/course");
			};
		}
	}

}