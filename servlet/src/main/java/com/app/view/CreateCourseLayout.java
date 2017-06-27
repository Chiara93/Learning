package com.app.view;

import static j2html.TagCreator.*;

import j2html.tags.ContainerTag;

public class CreateCourseLayout {

	public ContainerTag build() {
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
		            			form().withClass("form-horizontal").withRole("form").withMethod("post").withAction("/course/create").with(
			            				div().withClass("form-group").with(
			            					label("Name").withClass("col-sm-2 control-label").attr("for", "name"),
			            					div().withClass("col-sm-10").with(
			            						input().withClass("form-control").withType("text").withId("name").withName("name").withPlaceholder("Course name")
			            					)
			            				),
			            				div().withClass("form-group").with(
			            					label("Number").withClass("col-sm-2 control-label").attr("for", "number"),
			            					div().withClass("col-sm-10").with(
			            						input().withClass("form-control").withType("number").withId("number").withName("number")
			            					)
			            				),
			            				div().withClass("form-group").with(
			            					label("Description").withClass("col-sm-2 control-label").attr("for", "description"),
			            					div().withClass("col-sm-10").with(
			            						input().withClass("form-control").withType("text").withId("description").withName("description").withPlaceholder("Course description")
			            					)
			            				),
			            				div().withClass("form-group").with(
			            					label("Location").withClass("col-sm-2 control-label").attr("for", "location"),
			            					div().withClass("col-sm-10").with(
			            						input().withClass("form-control").withType("text").withId("location").withName("location").withPlaceholder("Course location")
			            					)
			            				),
			            				div().withClass("form-group").with(
			            					label("Start").withClass("col-sm-2 control-label").attr("for", "start"),
			            					div().withClass("col-sm-10").with(
			            						input().withClass("form-control").withType("date").withId("start").withName("start")
			            					)
			            				),
			            				div().withClass("form-group").with(
			            					label("Number of seats").withClass("col-sm-2 control-label").attr("for", "seats"),
			            					div().withClass("col-sm-3").with(
			            						input().withClass("form-control").withType("number").withId("seats").withName("seats")
			            					)
			            				),
			            				div().withClass("form-group").with(			            					
			            					div().withClass("col-sm-10 col-sm-offset-2").with(
			            						input().withClass("btn btn-primary").withId("submit").withName("submit").withType("submit").withValue("Send")
			            					)
			            				)
		            				)
		            			)
		            		)
		            	),
			        script().withSrc("/js/query.min.js"),
				    script().withSrc("/js/bootstrap.min.js")
			    ) 
			).attr("lang", "en");
	}
	

}
