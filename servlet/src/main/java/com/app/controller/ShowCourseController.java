package com.app.controller;

import com.app.view.ShowCourseLayout;

public class ShowCourseController implements Controller {
	
	private ShowCourseLayout _showCourseLayout = new ShowCourseLayout();

	@Override
	public boolean handles(String route) {
		return "/course".equals(route) || "/course/".equals(route) || "/".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {	
		context.response().setCharacterEncoding("UTF-8");
		context.response().setContentType("text/html");
		context.response().getWriter().write(_showCourseLayout.build().render());
	}
}
