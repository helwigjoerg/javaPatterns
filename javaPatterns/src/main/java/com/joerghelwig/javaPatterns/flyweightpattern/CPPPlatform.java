package com.joerghelwig.javaPatterns.flyweightpattern;

public class CPPPlatform implements Platform{
	
	public CPPPlatform(){
		System.out.println("CPPPlatform object created");
	}
	
	public void execute(Code code) {
		System.out.println("Compiling and executing CPP code.");
	}

}
