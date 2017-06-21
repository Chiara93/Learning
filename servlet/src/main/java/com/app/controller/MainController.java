package com.app.controller;

public class MainController implements Controller {
	
	//private final List<String> _routes = Arrays.asList("/", "/course/html", "/course/csv", "/course/raw");
	
	@Override
	public boolean handles(String route) {
		//return _routes.contains(route);
		return "/".contains(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		/*Seminar seminar = new Seminar(new Course("Math", 1, "Linear algebra"), "Manno", new Date(117, 3, 21), 20);
		seminar.enroll(new Student("Chiara", "Ferrario"));
		seminar.enroll(new Student("Katia", "Ferrario"));
		
		context.response().setCharacterEncoding("UTF-8");
		
		if(context.request().getRequestURI().equals("/course/html")) {
			context.response().setContentType("text/html");
			context.response().getWriter().write(new PrintFactory().printHtml(seminar));
		} else if(context.request().getRequestURI().equals("/course/csv")) {
			context.response().setContentType("text/csv");	
		    context.response().setHeader("Content-Disposition", "attachment; filename=" + "\"" + seminar.course().name() + ".csv\"");       
		    context.response().getWriter().write(new PrintFactory().printCsv(seminar));
		} else if(context.request().getRequestURI().equals("/course/raw")) {
			context.response().setContentType("text/plain");
			context.response().getWriter().write(new PrintFactory().printRaw(seminar));
		}*/
	}
}
