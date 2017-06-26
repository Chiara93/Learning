package com.app.view;

import static j2html.TagCreator.*;

import j2html.tags.ContainerTag;

public class NotFound404Layout implements Layout{

	@Override
	public ContainerTag build() {
		return html(
					head(
						meta().withCharset("utf-8"),
				    	meta().withContent("IE=edge").attr("http-equiv", "X-UA-Compatible"),
				    	meta().withName("viewport").withContent("width=device-width").attr("initial-scale", "1"),
						title("Error!")
					),					
					body(
						div(
							div(
								div(
									h1("Ops!"),
									h2("404 Not Found"),
									div("Sorry, an error has occured, Requested page not found!").withClass("error-details")
								).withClass("error-template").withStyle("padding: 40px 15px;text-align: center;")	
							).withClass("row")
						).withClass("container")
					)
			   );
	}

}
