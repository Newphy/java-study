package cn.newphy.thirdparty.jackson;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonPerfermance {
	
	
	/**
	 * 消耗时间: 156
	 */
	public void testSerialize() {
		Company company = Company.create();
		ObjectMapper objectMapper = JsonMapper.defaultMapper();
		
		Date time1 = new Date();
		for(int i = 0; i < 100000; i++) {
			try {
				objectMapper.writeValueAsString(company);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
		Date time2 = new Date();
		System.out.println("testSerialize消耗时间: " + (time2.getTime()-time1.getTime()));
	}
	
	/**
	 * 消耗时间: 140
	 */
	public void testDeserialize() {
		Company company = Company.create();
		ObjectMapper objectMapper = JsonMapper.defaultMapper();
		try {
			String json = objectMapper.writeValueAsString(company);
			Date time1 = new Date();
			for(int i = 0; i < 100000; i++) {
				objectMapper.readValue(json, Company.class);
			}
			Date time2 = new Date();
			System.out.println("testDeserialize消耗时间: " + (time2.getTime()-time1.getTime()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * 消耗时间: 297
	 */
	public void testSerializeAndDeserialize() {
		Company company = Company.create();
		ObjectMapper objectMapper = JsonMapper.defaultMapper();
		try {

			Date time1 = new Date();
			for(int i = 0; i < 100000; i++) {
				String json = objectMapper.writeValueAsString(company);
				objectMapper.readValue(json, Company.class);
			}
			Date time2 = new Date();
			System.out.println("testSerializeAndDeserialize消耗时间: " + (time2.getTime()-time1.getTime()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * 消耗时间: 297
	 */
	public void testReceive() {
		Company company = Company.create();
		ObjectMapper objectMapper = JsonMapper.defaultMapper();
		JavaType type = objectMapper.getTypeFactory().constructCollectionType(List.class, Department.class);
		try {
			String json = objectMapper.writeValueAsString(company);
			Date time1 = new Date();
			for(int i = 0; i < 100000; i++) {
				JsonNode node = objectMapper.readTree(json);
				JsonNode departNodes = node.get("departments");
				List<Department> departs = objectMapper.convertValue(departNodes, type);
				departs.size();
				String name = node.get("name").asText();
				name.toString();
			}
			Date time2 = new Date();
			System.out.println("testReceive消耗时间: " + (time2.getTime()-time1.getTime()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	

}
