package com.joerghelwig.javaPatterns.decoratorpattern.pizza;

public class SimplyNonVegPizza implements Pizza{
	
	@Override
	public String getDesc() {
		return "SimplyNonVegPizza (350)";
	}

	@Override
	public double getPrice() {
		return 350;
	}

}
