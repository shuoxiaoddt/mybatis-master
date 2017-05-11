package com.mbis.base;

import com.mbis.base.emun.BlogType;
import org.junit.Test;

/**
 * Created by uwayxs on 2017/5/11.
 */
public class emunTest {
    @Test
    public void emunTest(){
        for(BlogType blogType : BlogType.values()){
            System.out.println(blogType.getTitle());
        }
    }
}
