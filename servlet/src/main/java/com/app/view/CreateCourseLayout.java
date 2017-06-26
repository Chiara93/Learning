package com.app.view;

import static j2html.TagCreator.*;

import j2html.tags.ContainerTag;

public class CreateCourseLayout {

	public ContainerTag build() {
		return html(
			    head(
			    	meta().withCharset("utf-8"),
			    	meta().withContent("IE=edge").attr("http-equiv", "X-UA-Compatible"),
			    	meta().withName("viewport").withContent("width=device-width").attr("initial-scale", "1"),
			        title("Seminar"),
			        link().withRel("stylesheet").withHref("/css/bootstrap.min.css")
			    ),
			    body(
		            div(
		            	div(
		            		div(
		            			h1("Create Course Form").withClasses("page-header text-center"),
		            			form(
		            				div(
		            					label("Name").withClass("col-sm-2 control-label").attr("for", "name"),
		            					div(
		            						input().withClass("form-control").withType("text").withId("name").withName("name").withPlaceholder("Course name")
		            						).withClass("col-sm-10")
		            					).withClass("form-group"),
		            				div(
		            					label("Number").withClass("col-sm-2 control-label").attr("for", "number"),
		            					div(
		            						input().withClass("form-control").withType("number").withId("number").withName("number")
		            						).withClass("col-sm-10")
		            					).withClass("form-group"),
		            				div(
		            					label("Description").withClass("col-sm-2 control-label").attr("for", "description"),
		            					div(
		            						input().withClass("form-control").withType("text").withId("description").withName("description").withPlaceholder("Course description")
		            						).withClass("col-sm-10")
		            					).withClass("form-group"),
		            				div(
		            					label("Location").withClass("col-sm-2 control-label").attr("for", "location"),
		            					div(
		            						input().withClass("form-control").withType("text").withId("location").withName("location").withPlaceholder("Course location")
		            						).withClass("col-sm-10")
		            					).withClass("form-group"),
		            				div(
		            					label("Date").withClass("col-sm-2 control-label").attr("for", "date"),
		            					div(
		            						input().withClass("form-control").withType("date").withId("date").withName("date")
		            						).withClass("col-sm-10")
		            					).withClass("form-group"),
		            				div(
		            					label("Number of seats").withClass("col-sm-2 control-label").attr("for", "seats"),
		            					div(
		            						input().withClass("form-control").withType("number").withId("seats").withName("seats")
		            						).withClass("col-sm-3")
		            					).withClass("form-group"),
		            				div(			            					
		            					div(
		            						input().withClass("btn btn-primary").withId("submit").withName("submit").withType("submit").withValue("Send")
		            						).withClass("col-sm-10 col-sm-offset-2")
		            					).withClass("form-group")
		            				).withClass("form-horizontal").withRole("form").withMethod("post").withAction("/course/create")
		            			).withClass("col-md-6 col-md-offset-3")
		            		).withClass("row")
		            	).withClass("container"),
			        script().withSrc("/js/query.min.js"),
				    script().withSrc("/js/bootstrap.min.js")
			    ) 
			).attr("lang", "en");
	}
	

}
