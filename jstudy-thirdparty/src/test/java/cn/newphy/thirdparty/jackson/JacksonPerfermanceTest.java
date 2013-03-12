package cn.newphy.thirdparty.jackson;

import org.junit.Test;

public class JacksonPerfermanceTest {

	private static JacksonPerfermance jp = new JacksonPerfermance();
	
	@Test
	public void testTestSerialize() {
		jp.testSerialize();
	}

	@Test
	public void testTestDeserialize() {
		jp.testDeserialize();
	}

	@Test
	public void testTestSerializeAndDeserialize() {
		jp.testSerializeAndDeserialize();
	}

	@Test
	public void testTestReceive() {
		jp.testReceive();
	}

}
