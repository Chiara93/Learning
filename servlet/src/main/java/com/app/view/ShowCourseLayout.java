package com.app.view;

import static j2html.TagCreator.*;

import java.util.List;

import com.app.model.Course;
import com.app.validation.ValidDateFormatRule;

import j2html.tags.DomContent;

public class ShowCourseLayout extends Layout{
	
	public DomContent buildTableData(List<Course> courses) {
		DomContent tableElement = 
				div().withClass("col-lg-8 col-md-8 col-sm-9").with(
  						table().withClass("table table-striped").with(
  							thead().with(
  								tr().with(
  									th("id"),
  									th("name"),
  									th("location"),
  									th("totalSeats"),
  									th("start")
  								)
  							),
  							tbody().with(
  								each(courses, course -> tr(
  									td(String.valueOf(course.id())),
  									td().with(a(course.name()).withHref("/course/" + course.id())),
  									td(course.location()),
  									td(String.valueOf(course.seatsLeft())),
  									td(ValidDateFormatRule.SDF.format(course.date()))
  									)
  								)
  							)
  						)
  					);
		return build(tableElement);
	}
}
