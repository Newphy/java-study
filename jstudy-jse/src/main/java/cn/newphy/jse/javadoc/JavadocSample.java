package cn.newphy.jse.javadoc;

/**
 * Javadoc����.
 * <p>
 * ��ʾjavadoc��ʽ������
 * </p>
 * 
 * @author Phil
 * @date 2013-1-22 ����4:50:13
 */
public class JavadocSample {

	/**
	 * һ������
	 */
	private String field;

	/**
	 * ����javadoc����.
	 * <p>
	 * <b>����д�ӿ�˵�������:</b>
	 * <ul>
	 * <li>�ӿڷ���</li>
	 * <li>���ӻ��߸����˵��õķ���</li>
	 * <li>�����ⷽ��</li>
	 * </ul>
	 * <p>
	 * @param param1 
	 * @param param2
	 * @return
	 * @author Phil
	 * @date 2013-1-22 ����5:43:34
	 */
	public String method(String param1, String param2) {
		return "dd";
	}

	
	public static void main(String[] args) {
		JavadocSample sample = new JavadocSample();
		sample.method("", "");
	}
}
