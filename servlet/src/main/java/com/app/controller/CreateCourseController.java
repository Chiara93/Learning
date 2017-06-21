package com.app.controller;

import com.app.view.Layout;

public class CreateCourseController implements Controller{

	@Override
	public boolean handles(String route) {
		return "/course/create".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		context.response().setCharacterEncoding("UTF-8");
		context.response().setContentType("text/html");
		context.response().getWriter().write(new Layout().build().render());
	}

}
