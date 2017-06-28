package com.app.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Course;
import com.app.model.Seminar;
import com.app.validation.NotEmptyRule;
import com.app.validation.Rule;
import com.app.validation.Validator;
import com.app.view.CreateCourseLayout;

public class CreateCourseController implements Controller{
	
	public static List<Seminar> seminars = new ArrayList<>();
	
	@Override
	public boolean handles(String route) {
		return "/course/create".equals(route) || "/course/create/".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		HttpServletRequest request = context.request();
		HttpServletResponse response = context.response();
		
		if("GET".equals(request.getMethod())) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.getWriter().write(new CreateCourseLayout().buildForm().render());
		} else if("POST".equals(request.getMethod())) {
			validateForm(response, request);
			
		}
	}
	
	private void validateForm(HttpServletResponse response, HttpServletRequest request) throws IOException, NumberFormatException, ParseException {
		Map<String, Collection<Rule>> rules =  new HashMap<>();
		Map<String, String> requestFields = new HashMap<>();
		
		rules.put(Rule.COURSE_NAME, Arrays.asList(new NotEmptyRule()));
		rules.put(Rule.COURSE_LOCATION, Arrays.asList(new NotEmptyRule()));
		rules.put(Rule.COURSE_SEATS, Arrays.asList(new NotEmptyRule()));
		rules.put(Rule.COURSE_DESCRIPTION, Arrays.asList());
		
		requestFields.put(Rule.COURSE_NAME, request.getParameter(Rule.COURSE_NAME));
		//requestFields.put(Rule.COURSE_NUMBER, request.getParameter(Rule.COURSE_NUMBER).isEmpty() ? "0" : request.getParameter(Rule.COURSE_NUMBER));
		requestFields.put(Rule.COURSE_LOCATION, request.getParameter(Rule.COURSE_LOCATION));
		requestFields.put(Rule.COURSE_SEATS, request.getParameter(Rule.COURSE_SEATS));
		requestFields.put(Rule.COURSE_DESCRIPTION, request.getParameter(Rule.COURSE_DESCRIPTION));
		
		Validator validator = new Validator(rules, requestFields);
		if(validator.isValid()) {
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			Course course = new Course(request.getParameter("name"), Integer.parseInt(request.getParameter("number")), request.getParameter("description"));
			Seminar seminar = new Seminar(course, request.getParameter("location"), format.parse(request.getParameter("start")), Integer.parseInt(request.getParameter("seats")));
			if(seminars.add(seminar)) {
				response.sendRedirect("/course");
			}
		} else {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.getWriter().write(new CreateCourseLayout().buildValidatedForm(validator).render());	
		}
	}
}
