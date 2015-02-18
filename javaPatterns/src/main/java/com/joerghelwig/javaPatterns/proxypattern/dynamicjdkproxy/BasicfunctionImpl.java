package com.joerghelwig.javaPatterns.proxypattern.dynamicjdkproxy;

import java.util.Random;

public class BasicfunctionImpl implements Basicfunction {

	public void calculate(int number) {
	  Random random = new Random();
	  System.out.println("Doing some calculatiom " + random.nextInt()+number);

	}

}
