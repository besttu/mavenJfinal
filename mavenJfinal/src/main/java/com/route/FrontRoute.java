package com.route;

import com.controller.HelloController;
import com.interceptor.FrontInterceptor;
import com.jfinal.config.Routes;

/**
 * 配置前置路由
 * 
 * @author Administrator
 *
 */
public class FrontRoute extends Routes {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		// 路由级别拦截
		System.out.println("front routes");
		addInterceptor(new FrontInterceptor());
		setBaseViewPath("/");// 默认是web-app下面
		add("/frontTest", HelloController.class, "/front");
	}

}
