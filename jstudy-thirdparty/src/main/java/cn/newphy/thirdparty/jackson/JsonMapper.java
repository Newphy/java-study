package cn.newphy.thirdparty.jackson;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonMapper {

	public static ObjectMapper mapper(Include include) {
		ObjectMapper mapper = new ObjectMapper();
		// 设置输出时包含属性的风格
		mapper.setSerializationInclusion(include);
		// 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX);
		return mapper;
	}

	public static ObjectMapper defaultMapper() {
		return mapper(Include.NON_NULL);
	}

	public static ObjectWriter prettyWriter(ObjectMapper objectMapper) {
		return objectMapper.writer(new DefaultPrettyPrinter());
	}

	public static ObjectWriter prettyWriter() {
		return defaultMapper().writer(new DefaultPrettyPrinter());
	}

	/**
	 * 创建只输出非Null且非Empty(如List.isEmpty)的属性到Json字符串的Mapper,建议在外部接口中使用.
	 */
	public static ObjectMapper nonEmptyMapper() {
		return mapper(Include.NON_EMPTY);
	}
}
