package com.app.view;

import static j2html.TagCreator.div;
import static j2html.TagCreator.form;
import static j2html.TagCreator.input;
import static j2html.TagCreator.label;
import static j2html.TagCreator.textarea;

import com.app.model.Course;
import com.app.validation.ValidDateFormatRule;

import j2html.tags.DomContent;

public class UpdateCourseLayout extends Layout {
	
	public DomContent buildFormForUpdate(Course course) {
		DomContent formElement =
				 div().withClass("col-lg-8 col-md-8 col-sm-9").with(
					 form().withClass("form-horizontal").withRole("form").withMethod("post").withAction("/course/update/"+ course.id()).with(
							div().withClass("form-group").with(
								label("Name").withClass("col-sm-2 control-label").attr("for", "name"),
								div().withClass("col-sm-10").with(
									input().withClass("form-control").withType("text").withId("name").withName("name").withValue(course.name())
								)
							),
							div().withClass("form-group").with(
								label("Start").withClass("col-sm-2 control-label").attr("for", "start"),
								div().withClass("col-sm-10").with(
									input().withClass("form-control").withType("date").withId("start").withName("start").withValue(ValidDateFormatRule.SDF.format(course.date()))
								)
			    			),
							div().withClass("form-group").with(
								label("Location").withClass("col-sm-2 control-label").attr("for", "location"),
								div().withClass("col-sm-10").with(
									input().withClass("form-control").withType("text").withId("location").withName("location").withValue(course.location())
								)
							),
							div().withClass("form-group").with(
								label("Seats").withClass("col-sm-2 control-label").attr("for", "seats"),
								div().withClass("col-sm-10").with(
									input().withClass("form-control").withType("text").withId("seats").withName("seats").withValue(new Integer(course.seatsLeft()).toString())
								)
							),
							div().withClass("form-group").with(
								label("Description").withClass("col-sm-2 control-label").attr("for", "description"),
								div().withClass("col-sm-10").with(
									textarea().withClass("form-control").withType("text").withId("description").withName("description").withPlaceholder("description").withValue(course.description())
								)
							),
							div().withClass("form-group").with(			            					
								div().withClass("col-sm-10 col-sm-offset-2").with(
									input().withClass("btn btn-primary").withId("submit").withName("submit").withType("submit").withValue("Send")
								)
							)
						)
					);
		return build(formElement);
		
	}

}
