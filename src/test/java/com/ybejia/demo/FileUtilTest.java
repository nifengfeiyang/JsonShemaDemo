package com.ybejia.demo;

import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by 元宝E家 on 2018/1/24.
 */
public class FileUtilTest {
    @Test
    public void test() throws Exception{
        String content = FileUtil.readToString("src/test/resources/json_schema.txt");
        log.print(content);
        Assert.assertNotNull(content);
    }
}
