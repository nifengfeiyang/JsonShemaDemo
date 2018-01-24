package com.ybejia.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 提交订单json结构构造器
 */
public class JsonUtilTest {

    @Test
    public void test() throws Exception{
        JsonUtil jsonUtil = new JsonUtil();
        Map<String,Object> map5 = new HashMap<>();
        map5.put("name","张三");
        List<Map<String,Object>> list = new ArrayList<>();
        map5.put("versions",list);
        Map p1 = new HashMap();
        p1.put("id","n001");
        p1.put("version",1);
        list.add(p1);
        String attrs5 = jsonUtil.toJson(map5);
        System.out.println(attrs5);



    }

}
