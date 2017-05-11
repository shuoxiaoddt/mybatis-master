package com.mbis.base.dao;

import com.mbis.base.entity.Blog;

/**
 * Created by uwayxs on 2017/5/11.
 */
public interface BlogMapper {
    /**
     * 新增
     * @return
     */
    public int add(Blog blog);

    /**
     * 查询
     */
    public Blog selectBlog(int id);
}
