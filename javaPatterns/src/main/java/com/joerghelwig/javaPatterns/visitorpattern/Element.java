package com.joerghelwig.javaPatterns.visitorpattern;

public interface Element {
	
	public void accept(Visitor visitor);
}
