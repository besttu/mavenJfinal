package com.entity;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

public class Blog extends Model<Blog> {
	public static final Blog blog = new Blog();

	/**
	 * ��ҳ��ѯ
	 * 
	 * @param pageNumber��ǰҳ��
	 * @param pageSizeÿҳ����
	 */
	public Page<Blog> paginate(int pageNumber, int pageSize) {

		return paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
	}

}
