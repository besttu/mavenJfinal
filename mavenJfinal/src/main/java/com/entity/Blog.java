package com.entity;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

public class Blog extends Model<Blog> {
	public static final Blog blog = new Blog();

	/**
	 * 分页查询
	 * 
	 * @param pageNumber当前页数
	 * @param pageSize每页数量
	 */
	public Page<Blog> paginate(int pageNumber, int pageSize) {

		return paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
	}

}
