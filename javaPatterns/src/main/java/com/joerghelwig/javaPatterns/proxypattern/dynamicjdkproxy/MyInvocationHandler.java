package com.joerghelwig.javaPatterns.proxypattern.dynamicjdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target ;

	public MyInvocationHandler(Object target)
	{
		this.target = target;
	}


	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] params)throws Throwable {
		long a = System.currentTimeMillis();
		Object result;
		/*check permisson*/
		if(true){
			System.out.println("Access granted");
			result =method.invoke(target ,params);
		}
		System.out.println("total time taken  "+
				(System.currentTimeMillis()-a));
		return result;
	}

}
