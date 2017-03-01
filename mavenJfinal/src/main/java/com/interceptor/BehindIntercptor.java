package com.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * ∫Û÷√¬∑”…¿πΩÿ
 * 
 * @author Administrator
 */
public class BehindIntercptor implements Interceptor {

	public void intercept(Invocation inv) {
		// TODO Auto-generated method stub
		System.out.println("Before method invoking");
		inv.invoke();
		System.out.println("After method invoking");

	}

}
