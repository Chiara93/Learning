package com.app.controller;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.database.SQLiteJDBC;
import com.app.model.Course;
import com.app.validation.Rule;
import com.app.validation.RuleFactory;
import com.app.validation.ValidDateFormatRule;
import com.app.validation.Validator;
import com.app.view.CreateCourseLayout;

public class CreateCourseController implements Controller{
	
	public static List<Course> seminars = new ArrayList<>();
	private CreateCourseLayout _createCourseLayout = new CreateCourseLayout();
	
	@Override
	public boolean handles(String route) {
		return "/course/create".equals(route) || "/course/create/".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		HttpServletRequest request = context.request();
		HttpServletResponse response = context.response();
		Connection connection = context.connection();
		
		if("GET".equals(request.getMethod())) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.getWriter().write(_createCourseLayout.buildForm().render());
		} else if("POST".equals(request.getMethod())) {
			validateForm(response, request, connection);			
		}
	}
	
	private void validateForm(HttpServletResponse response, HttpServletRequest request, Connection connection) throws IOException, NumberFormatException, ParseException {
		Map<String, String> requestFields = new HashMap<>();
		
		String name = request.getParameter(Rule.COURSE_NAME);
		String number = request.getParameter(Rule.COURSE_NUMBER);
		String start = request.getParameter(Rule.COURSE_START);
		String location = request.getParameter(Rule.COURSE_LOCATION);
		String seats = request.getParameter(Rule.COURSE_SEATS);
		String description = request.getParameter(Rule.COURSE_DESCRIPTION);
		
		requestFields.put(Rule.COURSE_NAME, name);
		requestFields.put(Rule.COURSE_NUMBER, number);
		requestFields.put(Rule.COURSE_START, start);
		requestFields.put(Rule.COURSE_LOCATION, location);
		requestFields.put(Rule.COURSE_SEATS, seats);
		requestFields.put(Rule.COURSE_DESCRIPTION, description);
		
		Validator validator = new Validator(RuleFactory.rules(), requestFields);
		if(validator.isValid()) {
			Course course = new Course(name, Integer.parseInt(number), description, location, ValidDateFormatRule.SDF.parse(start), Integer.parseInt(seats));
			//SQLiteJDBC.getInstance().insert(connection, course);
			if(seminars.add(course)) {
				response.sendRedirect("/course");
			}
		} else {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.getWriter().write(_createCourseLayout.buildValidatedForm(validator).render());	
		}
	}
}
