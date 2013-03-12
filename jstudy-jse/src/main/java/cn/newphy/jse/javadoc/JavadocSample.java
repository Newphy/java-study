package cn.newphy.jse.javadoc;

/**
 * Javadoc样例.
 * <p>
 * 显示javadoc格式的样例
 * </p>
 * 
 * @author Phil
 * @date 2013-1-22 下午4:50:13
 */
public class JavadocSample {

	/**
	 * 一个变量
	 */
	private String field;

	/**
	 * 方法javadoc样例.
	 * <p>
	 * <b>必须写接口说明的情况:</b>
	 * <ul>
	 * <li>接口方法</li>
	 * <li>复杂或者给别人调用的方法</li>
	 * <li>基础库方法</li>
	 * </ul>
	 * <p>
	 * @param param1 
	 * @param param2
	 * @return
	 * @author Phil
	 * @date 2013-1-22 下午5:43:34
	 */
	public String method(String param1, String param2) {
		return "dd";
	}

	
	public static void main(String[] args) {
		JavadocSample sample = new JavadocSample();
		sample.method("", "");
	}
}
