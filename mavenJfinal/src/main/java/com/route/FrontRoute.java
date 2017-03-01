package com.route;

import com.controller.HelloController;
import com.interceptor.FrontInterceptor;
import com.jfinal.config.Routes;

/**
 * ����ǰ��·��
 * 
 * @author Administrator
 *
 */
public class FrontRoute extends Routes {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		// ·�ɼ�������
		System.out.println("front routes");
		addInterceptor(new FrontInterceptor());
		setBaseViewPath("/");// Ĭ����web-app����
		add("/frontTest", HelloController.class, "/front");
	}

}
