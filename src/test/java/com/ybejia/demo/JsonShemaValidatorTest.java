package com.ybejia.demo;

import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.messages.JsonSchemaValidationBundle;
import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by 元宝E家 on 2018/1/24.
 */
public class JsonShemaValidatorTest {
    @Test
    public void test() throws Exception{
        String schema = FileUtil.readToString("src/test/resources/json_schema.txt");
        log.print(schema);
        String json = FileUtil.readToString("src/test/resources/json_content.txt");
        log.print(json);
        ProcessingReport report = JsonShemaValidator.validatorSchema(schema,json);
        boolean result = report.isSuccess();
        Assert.assertTrue(result);
    }
}
