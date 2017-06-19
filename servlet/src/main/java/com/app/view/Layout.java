package com.app.view;

import static j2html.TagCreator.*;

import com.app.model.Seminar;

import j2html.tags.ContainerTag;

public class Layout {

	public ContainerTag build(Seminar seminar) {
		return html(
			    	head(
			            title(seminar.course().name()),
			            link().withRel("stylesheet").withHref("/css/main.css")
			        ),
			        body(
			            main(attrs("#main.content"),
			                div(seminar.course().name()),
			                ul(
			                	li(seminar.course().description()),
			                	li(seminar.location()),
			                	li(seminar.date().toString())
			                 ),	
			                div("Partecipanti:"),
			                ul().with(
			                        each(seminar.studentList(), student -> li(
			                            h6(student.name())
			                        ))
			            )
			            ) 
			        )
			    );			
	}

}
