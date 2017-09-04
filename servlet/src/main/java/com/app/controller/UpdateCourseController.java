package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.database.SQLiteJDBC;
import com.app.model.Course;
import com.app.view.UpdateCourseLayout;

public class UpdateCourseController implements Controller {
	
	private final UpdateCourseLayout _updateCourseLayout = new UpdateCourseLayout();
	
	@Override
	public boolean handles(String route) {
		return route.matches("/course/\\d+");
	}

	@Override
	public void execute(Context context) throws Exception {
		HttpServletRequest request = context.request();
		HttpServletResponse response = context.response();
		
		String[] path = context.request().getRequestURI().split("/");
		
		Course course = SQLiteJDBC.getInstance().findById(context.connection(), Integer.parseInt(path[2]));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.getWriter().write(_updateCourseLayout.buildFormForUpdate(course).render());
	}

}
