package com.joerghelwig.javaPatterns.flyweightpattern;

public class CPlatform implements Platform {
	
	public CPlatform(){
		System.out.println("CPlatform object created");
	}

	public void execute(Code code) {
		System.out.println("Compiling and executing C code.");
	}

}
