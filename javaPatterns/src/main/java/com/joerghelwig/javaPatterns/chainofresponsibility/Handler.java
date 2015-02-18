package com.joerghelwig.javaPatterns.chainofresponsibility;

public interface Handler {
	
	/**
	 * The setHandler is used to set the next handler in the chain,
	 *  whereas; the process method is used to process the request, 
	 *  only if the handler can able process the request. Optionally, 
	 *  we have the getHandlerName method which is used to return the handler�s name.
	 * 
	 * @param handler
	 */
	public void setHandler(Handler handler);
	public void process(File file);
	public String getHandlerName();
}
