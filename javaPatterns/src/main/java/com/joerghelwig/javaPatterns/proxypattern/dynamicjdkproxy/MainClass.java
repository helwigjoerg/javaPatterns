package com.joerghelwig.javaPatterns.proxypattern.dynamicjdkproxy;

import java.lang.reflect.Proxy;

public class MainClass {

	public static void main(String[] args) {

		BasicfunctionImpl basfuncImpl= new BasicfunctionImpl();

		Basicfunction proxied =(Basicfunction)Proxy
				.newProxyInstance(MainClass.class.getClassLoader(),
						basfuncImpl.getClass().getInterfaces() ,new MyInvocationHandler(basfuncImpl));
		
		
		proxied.calculate(8);;

	}

}
