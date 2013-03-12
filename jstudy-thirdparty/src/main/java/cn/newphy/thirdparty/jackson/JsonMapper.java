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
		// �������ʱ�������Եķ��
		mapper.setSerializationInclusion(include);
		// ��������ʱ������JSON�ַ����д��ڵ�Java����ʵ��û�е�����
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
	 * ����ֻ�����Null�ҷ�Empty(��List.isEmpty)�����Ե�Json�ַ�����Mapper,�������ⲿ�ӿ���ʹ��.
	 */
	public static ObjectMapper nonEmptyMapper() {
		return mapper(Include.NON_EMPTY);
	}
}
