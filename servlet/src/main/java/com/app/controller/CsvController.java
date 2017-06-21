package com.app.controller;

import java.util.Date;

import com.app.model.Course;
import com.app.model.Seminar;
import com.app.model.Student;

import utils.PrintFactory;

public class CsvController implements Controller{

	@Override
	public boolean handles(String route) {
		return "/course/csv".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		Seminar seminar = new Seminar(new Course("Math", 1, "Linear algebra"), "Manno", new Date(117, 3, 21), 20);
		seminar.enroll(new Student("Chiara", "Ferrario"));
		seminar.enroll(new Student("Katia", "Ferrario"));
		
		context.response().setCharacterEncoding("UTF-8");
		context.response().setContentType("text/csv");	
	    context.response().setHeader("Content-Disposition", "attachment; filename=" + "\"" + seminar.course().name() + ".csv\"");       
	    context.response().getWriter().write(new PrintFactory().printCsv(seminar));
	}

}
