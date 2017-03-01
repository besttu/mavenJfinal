package com.config;

import com.controller.HelloController;
import com.entity.Blog;
import com.interceptor.GlobalInterceptor;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.route.BehindRoute;
import com.route.FrontRoute;

public class DemoConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		// 设置渲染视图
		// me.setViewType(ViewType.JSP);
		// 加载外部配置文件
		PropKit.use("system_info.txt");
		// 设置开发模式
		me.setDevMode(PropKit.getBoolean("devMode", false));

	}

	@Override
	public void configEngine(Engine arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		me.add(new GlobalInterceptor());

	}

	/**
	 * c3p0数据源
	 * 
	 * @return
	 */

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		C3p0Plugin p = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
		// 配置C3p0数据库连接池插件
		me.add(p);
		// 配置ActiveRecordPlugin插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(p);
		arp.addMapping("blog", Blog.class);// 默认 主键是id 如果是u_id 为
		// 配置属性名(字段名)大小写不敏感容器工厂
		arp.setContainerFactory(new CaseInsensitiveContainerFactory());
		me.add(arp);

	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		// 配置前后路由
		me.add(new FrontRoute());
		me.add(new BehindRoute());

	}

}
