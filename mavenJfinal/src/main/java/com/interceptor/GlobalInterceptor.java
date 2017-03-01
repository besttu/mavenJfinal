package com.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * ÅäÖÃÈ«¾ÖµÄÀ¹½ØÆ÷
 * 
 * @author Administrator
 *
 */
public class GlobalInterceptor implements Interceptor {

	public void intercept(Invocation inv) {
		// TODO Auto-generated method stub
		System.out.println(" Global before Interceptor");
		inv.invoke();
		System.out.println(" Global after Interceptor");
	}

}
