package cn.gaoyuexiang.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 处理 Json 数据
 */
public class JsonMapper {
    private static ObjectMapper mapper;

    public static <T> ArrayList<T> resolveJSON(InputStream input, T t) throws IOException {
        if (mapper == null) {
            mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        }
        JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, t.getClass());
        return mapper.readValue(input, javaType);
    }
}
