package cn.gaoyuexiang.json;

import cn.gaoyuexiang.entry.Goods;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
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

//    public static <T> void resolveJSON(File json, T t) throws IOException {
//        if (mapper == null) {
//            mapper = new ObjectMapper();
//            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        }
//        t = mapper.readValue(json, t.getClass());
//    }

    public static <T> ArrayList<T> resolveJSON(InputStream input, T t) throws IOException {
        if (mapper == null) {
            mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        }
        JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, t.getClass());
        return mapper.readValue(input, javaType);
    }
    
//    public static ArrayList<Goods> resolveGoodsJSON(String fileName) throws IOException {
//        if (mapper == null) {
//            mapper = new ObjectMapper();
//            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        }
//        File reader = new File(fileName);
//        JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, Goods.class);
//        return mapper.readValue(reader, javaType);
//    }
}
