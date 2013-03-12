package cn.newphy.jse.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.newphy.jse.JseSample;


/**
 * ������ʽ����.
 * 
 * <p><b><code>java.util.regex.Matcher</code></b>
 * <ul>
 * <li>{@link #appendReplacement_Matcher() appendReplacement}������ʹ��</li>
 * </ul>
 * 
 * @author Phil
 * @date 2013-1-23 ����11:00:45
 */
public class RegexExpressionSample extends JseSample {

	
	/**
	 * <code>appendReplacement</code>��ʹ�÷���.
	 * 
	 * <p><code>appendReplacement</code>ʹ��һ��<code>StringBuffer</code>�������滻���ַ�����
	 * <code>appendReplacement</code>����<code>replaceAll</code>�ĵײ�ʵ��
	 * 
	 * <p><b>Note:</b> replacementһ��ʹ��<code>Matcher.quoteReplacement</code>�����滻���ַ�
	 * �����������ַ���ת����<code>$</code>�ͷ�б��<code>\</code>���滻�ַ�����û������
	 * <br>
	 * ��������: ����滻�ַ���<code>$dog</code>��ʹ��<code>quoteReplacement</code>��������
	 * ת��������replace�����з����쳣
	 * 
	 * @author Phil
	 * @date 2013-1-23 ����5:05:23
	 */
	public void appendReplacement_Matcher() {
		String text = "fatcatfatcatfatfatcatccc";
		String regex = "c.?t";
		String replacement = Matcher.quoteReplacement("$dog");
		
		StringBuffer sb = new StringBuffer();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			matcher.appendReplacement(sb, replacement);
			System.out.println(sb);
		}
		matcher.appendTail(sb);
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		RegexExpressionSample re = new RegexExpressionSample();
		re.appendReplacement_Matcher();
	}
}
