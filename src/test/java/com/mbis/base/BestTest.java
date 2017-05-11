package com.mbis.base;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.InputStream;

/**
 * Created by uwayxs on 2017/5/11.
 */
public class BestTest{
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final String MYBATIS_CONFIG_PATH="/mybatis-config.xml";
    @Before
    public void init(){
        if(sqlSessionFactory==null){
            InputStream inputStream = BestTest.class.getResourceAsStream(MYBATIS_CONFIG_PATH);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
    }
    public SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
