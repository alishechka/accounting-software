package com.accounting.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    public static String convertJavaToJson(Object object) {
        String jsonResult = " ";
        try {
            jsonResult = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonResult;

    }

    public static <T> T convertJsonToJava(String jsonString, Class<T> cls) {
        T result=null;
        try {
            result=mapper.readValue(jsonString, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


}
