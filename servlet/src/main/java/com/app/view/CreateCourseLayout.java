package com.app.view;

import static j2html.TagCreator.*;

import java.util.Collection;

import com.app.validation.Rule;
import com.app.validation.Validator;

import j2html.tags.ContainerTag;
import j2html.tags.DomContent;

public class CreateCourseLayout {

	public ContainerTag build(DomContent element) {
		return html().with(
			    head().with(
			    	meta().withCharset("utf-8"),
			    	meta().withContent("IE=edge").attr("http-equiv", "X-UA-Compatible"),
			    	meta().withName("viewport").withContent("width=device-width").attr("initial-scale", "1"),
			        title("Create course"),
			        link().withRel("stylesheet").withHref("/css/bootstrap.min.css")
			    ),
			    body().with(
		            div().withClass("container").with(
		            	div().withClass("row").with(
		            		div().withClass("col-md-6 col-md-offset-3").with(
		            			h1("Create Course Form").withClasses("page-header text-center"),
		            			element
		            			)
		            		)
		            	),
			        script().withSrc("/js/query.min.js"),
				    script().withSrc("/js/bootstrap.min.js")
			    ) 
			).attr("lang", "en");
	}
	
	public DomContent buildForm() {
		DomContent formElement =
				 form().withClass("form-horizontal").withRole("form").withMethod("post").withAction("/course/create").with(
						div().withClass("form-group").with(
							label("Name").withClass("col-sm-2 control-label").attr("for", "name"),
							div().withClass("col-sm-10").with(
								input().withClass("form-control").withType("text").withId("name").withName("name")
							)
						),
						div().withClass("form-group").with(
							label("Number").withClass("col-sm-2 control-label").attr("for", "number"),
							div().withClass("col-sm-10").with(
								input().withClass("form-control").withType("text").withId("number").withName("number")
							)
						),
						div().withClass("form-group").with(
							label("Start").withClass("col-sm-2 control-label").attr("for", "start"),
							div().withClass("col-sm-10").with(
								input().withClass("form-control").withType("date").withId("start").withName("start")
							)
		    			),
						div().withClass("form-group").with(
							label("Location").withClass("col-sm-2 control-label").attr("for", "location"),
							div().withClass("col-sm-10").with(
								input().withClass("form-control").withType("text").withId("location").withName("location")
							)
						),
						div().withClass("form-group").with(
							label("Seats").withClass("col-sm-2 control-label").attr("for", "seats"),
							div().withClass("col-sm-10").with(
								input().withClass("form-control").withType("text").withId("seats").withName("seats")
							)
						),
						div().withClass("form-group").with(
							label("Description").withClass("col-sm-2 control-label").attr("for", "description"),
							div().withClass("col-sm-10").with(
								textarea().withClass("form-control").withType("text").withId("description").withName("description").withPlaceholder("description")
							)
						),
						div().withClass("form-group").with(			            					
							div().withClass("col-sm-10 col-sm-offset-2").with(
								input().withClass("btn btn-primary").withId("submit").withName("submit").withType("submit").withValue("Send")
							)
						)
					);
		return build(formElement);
	}

	public DomContent buildValidatedForm(Validator validator) {
		DomContent formElement =
				 form().withClass("form-horizontal").withRole("form").withMethod("post").withAction("/course/create").with(
					createValidatedInput("Name", Rule.COURSE_NAME, Rule.COURSE_NAME, validator.get(Rule.COURSE_NAME), validator.validate().get(Rule.COURSE_NAME)),
					createValidatedInput("Number", Rule.COURSE_NUMBER, Rule.COURSE_NUMBER, validator.get(Rule.COURSE_NUMBER), validator.validate().get(Rule.COURSE_NUMBER)),
					createValidatedInput("Start", Rule.COURSE_START, Rule.COURSE_START, validator.get(Rule.COURSE_START), validator.validate().get(Rule.COURSE_START)),
					createValidatedInput("Location", Rule.COURSE_LOCATION, Rule.COURSE_LOCATION, validator.get(Rule.COURSE_LOCATION), validator.validate().get(Rule.COURSE_LOCATION)),
					createValidatedInput("Seats", Rule.COURSE_SEATS, Rule.COURSE_SEATS, validator.get(Rule.COURSE_SEATS), validator.validate().get(Rule.COURSE_SEATS)),
					createValidatedInput("Description", Rule.COURSE_DESCRIPTION, Rule.COURSE_DESCRIPTION, validator.get(Rule.COURSE_DESCRIPTION), validator.validate().get(Rule.COURSE_DESCRIPTION)),
					createSubmitButton()
				 );
		return build(formElement);
	}

	private ContainerTag createSubmitButton() {
		ContainerTag submit =
				div().withClass("form-group").with(			            					
				div().withClass("col-sm-10 col-sm-offset-2").with(
						input().withClass("btn btn-primary").withId("submit").withName("submit").withType("submit").withValue("Send")
					)
				);
		return submit;
	}

	private ContainerTag createValidatedInput(String label, String id, String name, String value, Collection<String> errors) {
		ContainerTag input = 
				div().withClass(errors == null ? "form-group has-success has-feedback" : "form-group has-error has-feedback").with(
					label(label).withClass("col-sm-2 control-label").attr("for", label),
					div().withClass("col-sm-10").with(
						input().withClass("form-control")
							   .withType("text")
							   .withId(id)
							   .withName(name)
							   .withValue(value),
						span().withClass(errors == null ? "glyphicon glyphicon-ok form-control-feedback" : "glyphicon glyphicon-remove form-control-feedback"),
						span(errors == null ? "success" : "error").withClass("sr-only")
					)
				);
				if(errors != null) {
					input.with(span("Please insert a valid " + id).withClass("help-block"));
				}
				/*if(errors != null) {
					for (String message : errors) {
						input.with(span(message).withClass("help-block"));
					}
				}*/
		return input;
	}
	

}
