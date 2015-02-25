package com.joerghelwig.javaPatterns.strategypattern;

public class ArialTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("[ArialTextFormatter]: "+text);
	}

}
