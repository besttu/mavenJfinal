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
		// ������Ⱦ��ͼ
		// me.setViewType(ViewType.JSP);
		// �����ⲿ�����ļ�
		PropKit.use("system_info.txt");
		// ���ÿ���ģʽ
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
	 * c3p0����Դ
	 * 
	 * @return
	 */

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		C3p0Plugin p = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
		// ����C3p0���ݿ����ӳز��
		me.add(p);
		// ����ActiveRecordPlugin���
		ActiveRecordPlugin arp = new ActiveRecordPlugin(p);
		arp.addMapping("blog", Blog.class);// Ĭ�� ������id �����u_id Ϊ
		// ����������(�ֶ���)��Сд��������������
		arp.setContainerFactory(new CaseInsensitiveContainerFactory());
		me.add(arp);

	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		// ����ǰ��·��
		me.add(new FrontRoute());
		me.add(new BehindRoute());

	}

}
