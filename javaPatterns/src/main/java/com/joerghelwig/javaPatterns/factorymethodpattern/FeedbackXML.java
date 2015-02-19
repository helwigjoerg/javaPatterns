package com.joerghelwig.javaPatterns.factorymethodpattern;

public class FeedbackXML implements XMLParser{

	@Override
	public String parse() {
		System.out.println("Parsing feedback XML...");
		return "Feedback XML Message";
	}

}

