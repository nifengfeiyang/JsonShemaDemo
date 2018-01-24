package com.ybejia.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringWriter;

public class JsonUtil {
	private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

	private ObjectMapper objectMapper;

	public JsonUtil() {
		objectMapper = new ObjectMapper();
	}

	public String toJson(Object bean) throws Exception{
		String value = null;
		StringWriter out = null;
		try {
			out = new StringWriter();
			objectMapper.writeValue(out, bean);
			value = out.toString();
		} catch (Exception e) {
			logger.error("转换异常",e);
			throw e;
		}finally {
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
				}
		}
		return value;
	}
	public Object fromJson(String json,Class<?> clazz) throws Exception{
		Object value = null;
		try {
			value = objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			logger.error("转换异常",e);
			throw e;
		}
		return value;
	}


}
