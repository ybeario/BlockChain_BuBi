package com.ybear.blockchain.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


	public class JsonUtils {

	    public static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	    public static <T> T fromJson(String jsonString, Class<T> valueType) throws IOException {
	        return OBJECT_MAPPER.readValue(jsonString, valueType);
	    }

	    public static String toJson(Object object) throws JsonProcessingException {
	        return OBJECT_MAPPER.writeValueAsString(object);
	    }
	}

