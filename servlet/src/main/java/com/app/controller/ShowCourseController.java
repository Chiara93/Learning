package com.app.controller;

import java.util.List;

import com.app.database.SQLiteJDBC;
import com.app.model.Course;
import com.app.view.ShowCourseLayout;

public class ShowCourseController implements Controller {
	
	private final ShowCourseLayout _showCourseLayout = new ShowCourseLayout();

	@Override
	public boolean handles(String route) {
		return "/course".equals(route) || "/course/".equals(route) || "/".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {	
		context.response().setCharacterEncoding("UTF-8");
		context.response().setContentType("text/html");
		List<Course> courses = SQLiteJDBC.getInstance().findAll(context.connection());
		context.response().getWriter().write(_showCourseLayout.buildTableData(courses).render());
	}
}
