package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.database.SQLiteJDBC;
import com.app.model.Course;
import com.app.validation.Rule;
import com.app.validation.RuleFactory;
import com.app.validation.Validator;
import com.app.view.UpdateCourseLayout;

public class UpdateCourseController implements Controller {

	private final UpdateCourseLayout _updateCourseLayout = new UpdateCourseLayout();

	@Override
	public boolean handles(String route) {
		return route.matches("/course/\\d+") || route.matches("/course/update/\\d+");
	}

	@Override
	public void execute(Context context) throws Exception {
		HttpServletRequest request = context.request();
		HttpServletResponse response = context.response();

		String[] path = context.request().getRequestURI().split("/");

		if("GET".equals(request.getMethod())) {		
			Course course = SQLiteJDBC.getInstance().findById(context.connection(), Integer.parseInt(path[2]));
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.getWriter().write(_updateCourseLayout.buildFormForUpdate(course).render());
		} else if("POST".equals(request.getMethod())) {

			Map<String, String> requestFields = new HashMap<>();

			String name = request.getParameter(Rule.COURSE_NAME);
			String start = request.getParameter(Rule.COURSE_START);
			String location = request.getParameter(Rule.COURSE_LOCATION);
			String seats = request.getParameter(Rule.COURSE_SEATS);
			String description = request.getParameter(Rule.COURSE_DESCRIPTION);

			requestFields.put(Rule.COURSE_NAME, name);
			requestFields.put(Rule.COURSE_START, start);
			requestFields.put(Rule.COURSE_LOCATION, location);
			requestFields.put(Rule.COURSE_SEATS, seats);
			requestFields.put(Rule.COURSE_DESCRIPTION, description);

			Validator validator = new Validator(RuleFactory.rules(), requestFields);
			if(validator.isValid()) {	
				System.out.println("Sono nel posto giusto");
				SQLiteJDBC.getInstance().update(context.connection(), path[3], requestFields);
				response.sendRedirect("/course");
			} else {
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html");
				response.getWriter().write(CreateCourseController._createCourseLayout.buildValidatedForm(context.request().getRequestURI(), validator).render());	
			}
		}
	}

}
