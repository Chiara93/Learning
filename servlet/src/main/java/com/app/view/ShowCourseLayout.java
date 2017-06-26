package com.app.view;

import static j2html.TagCreator.*;

import com.app.controller.CreateCourseController;

import j2html.tags.ContainerTag;

public class ShowCourseLayout implements Layout {

	@Override
	public ContainerTag build() {
		return html().with(
						  head().with(
								  	meta().withCharset("utf-8"),
							    	meta().withContent("IE=edge").attr("http-equiv", "X-UA-Compatible"),
							    	meta().withName("viewport").withContent("width=device-width").attr("initial-scale", "1"),
							        title("Courses"),
							        link().withRel("stylesheet").withHref("/css/bootstrap.min.css")
								  ),
						  body().with(
									  each(CreateCourseController.seminars, seminar ->
							            div(h2(seminar.course().name())
							            )
									  )
								 )
						  );
	}

}
