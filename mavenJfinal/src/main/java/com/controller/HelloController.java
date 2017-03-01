package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.entity.Blog;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class HelloController extends Controller {

	public void index() {
		// ��ѯ��������
		int pageNumber = 1;
		int pageSize = 5;
		List<Blog> list = Blog.blog.dao().find("select * from blog");
		HttpSession session = getSession();
		try {
			pageNumber = Integer.parseInt(getPara("pageNumber"));
			session.setAttribute("pageNumber", pageNumber);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			pageSize = Integer.parseInt(getPara("pageSize"));
			session.setAttribute("pageSize", pageSize);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Page<Blog> p_blog = Blog.blog.dao().paginate(pageNumber, pageSize);
		setAttr("bg", p_blog);
		render("FrontTest.jsp");
	}

	public void add() {
		render("add.jsp");
	}

	public void doadd() {
		Blog b = getModel(Blog.class, "b");
		b.save();
		System.out.println(getModel(Blog.class, "b"));// �������u����д��Ĭ����ʵ���������ĸСд
		index();
	}

	/**
	 * ͨ��idɾ��
	 */
	public void delete() {
		int id = getParaToInt("did");
		System.out.println(id);
		Blog.blog.dao().deleteById(id);
		index();
	}

	public void add1() {
		int id = getParaToInt("bid");
		Blog bl = Blog.blog.dao().findById(id);
		setAttr("bl", bl);
		render("add1.jsp");
	}

	public void updata() {
		Blog b = getModel(Blog.class, "b");
		int id = b.getInt("id");
		String title = b.get("title");
		String content = b.get("content");
		Blog blog = new Blog();
		blog.set("id", id);
		blog.set("title", title);
		blog.set("content", content);
		blog.update();
		index();
	}

}
