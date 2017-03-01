package com.route;

import com.controller.BehindController;
import com.jfinal.config.Routes;

/**
 * ≈‰÷√∫Û÷√¬∑”…
 * 
 * @author Administrator
 */
public class BehindRoute extends Routes {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		setBaseViewPath("/WEB-INF");
		add("/behindTest", BehindController.class, "/behind");
	}

}
