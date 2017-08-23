package com.app.view;

import static j2html.TagCreator.*;

import com.app.controller.CreateCourseController;
import com.app.validation.ValidDateFormatRule;

import j2html.tags.ContainerTag;

public class ShowCourseLayout implements Layout {

	@Override
	public ContainerTag build() {
		return html().attr("lang", "en").with(
			  head().with(
					  	meta().withCharset("utf-8"),
				    	meta().withContent("IE=edge").attr("http-equiv", "X-UA-Compatible"),
				    	meta().withName("viewport").withContent("width=device-width").attr("initial-scale", "1"),
				        title("Courses"),
				        link().withRel("stylesheet").withHref("/css/bootstrap.min.css?v=1.0.0").attr("media", "screen"),
				        link().withRel("stylesheet").withHref("/css/custom.css?v=1.0.0"),
				        link().withRel("stylesheet").withHref("/css/app.css?v=1.0.0"),
				        script().withSrc("https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"),
				        script().withSrc("https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js")
					  ),
			  body().with(
					  	div().withClass("navbar navbar-default navbar-fixed-top").with(
					  		div().withClass("container").with(
					  			div().withClass("navbar-header").with(
					  				a("Seminar").withClass("navbar-brand").withHref("/"),
					  				button().withClass("navbar-toggle").withType("button").attr("data-toggle", "collapse").attr("data-target", "#navbar-main").with(
					  					span().withClass("icon-bar"),
					  					span().withClass("icon-bar"),
					  					span().withClass("icon-bar")
					  				)
					  			),
					  			div().withClass("navbar-collapse collapse").withId("navbar-main").with(
					  				ul().withClass("nav navbar-nav navbar-right").with(
					  					li().withClass("dropdown").with(
					  						a("Account").withClass("dropdown-toggle").attr("data-toggle", "dropdown").attr("aria-expanded", "false").withHref("#").withId("download").with(
					  							span().withClass("caret")
					  						),
					  						ul().withClass("dropdown-menu").attr("aria-labelledby", "download").with(
					  							li().with(a("settings").withHref("/")),
					  							li().withClass("divider"),
					  							li().with(a("logout").withHref("/"))
					  						)
					  					)
					  				)
					  			)
					  		)
					  	),
				  		div().withClass("container").with(
				  			div().withClass("page-header").withId("banner").with(
				  				div().withClass("row").with(
				  					div().withClass("col-lg-8 col-md-7 col-sm-6").with(
				  						h1("Seminar"),
				  						p("Manage your courses!").withClass("lead")
				  					)
				  				),
				  				div().withClass("row").with(
				  					div().withClass("col-lg-2 col-md-2 col-sm-3").with(
				  						div().withClass("list-group table-of-contents").with(
				  							a("List").withClass("list-group-item").withHref("/course"),
				  							a("Create").withClass("list-group-item").withHref("/course/create")
				  						)
				  					),
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
				  								each(CreateCourseController.seminars, seminar -> tr(
				  									td(String.valueOf(seminar.id())),
				  									td(seminar.name()),
				  									td(seminar.location()),
				  									td(String.valueOf(seminar.seatsLeft())),
				  									td(ValidDateFormatRule.SDF.format(seminar.date()))
				  									)
				  								)
				  							)
				  						)
				  					)
				  				)
				  			),
				  			footer().with(
				  				div().withClass("row").with(
				  					div().withClass("col-lg-12").with(
				  						p().with(a("Cerulean theme").withHref("http://bootswatch.com/cerulean").withRel("nofollow")),
				  						p("Code released under the ").with(a("MIT License").withHref("https://github.com/thomaspark/bootswatch/blob/gh-pages/LICENSE")),
				  						p("GmTechnologies")
				  					)
				  				)
				  			)
				  		),
				  		script().withSrc("/js/jquery.min.js?v=1.0.0"),
				  		script().withSrc("/js/bootstrap.min.js?v=1.0.0"),
				  		script().withSrc("/js/custom.js?v=1.0.0")
				  	)
				);  
	}
}
