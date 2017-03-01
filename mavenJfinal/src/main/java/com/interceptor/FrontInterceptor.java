package com.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * «∞÷√¬∑”…¿πΩÿ
 * 
 * @author Administrator
 */
public class FrontInterceptor implements Interceptor {

	public void intercept(Invocation inv) {
		// TODO Auto-generated method stub
		System.out.println("Front Before method invoking");
		inv.invoke();
		System.out.println("Front After method invoking");

	}

}
