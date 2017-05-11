package com.mbis.base;

import com.mbis.base.dao.BlogMapper;
import com.mbis.base.entity.Blog;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Created by uwayxs on 2017/5/11.
 */
public class MybatisTest  extends  BestTest{
    /**
     * 使用configuration文件构建sqlSession
     */
    @Test
    public void testSelect(){
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.selectBlog(1);
        //Blog blog = (Blog) sqlSession.selectOne("com.mbis.base.dao.BlogMapper.selectBlog", 1);
        System.out.println(blog);
    }

}
