package com.joerghelwig.javaPatterns.abstractfactorypattern.xmlParser;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
