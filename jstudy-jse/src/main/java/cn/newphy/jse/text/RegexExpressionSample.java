package cn.newphy.jse.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.newphy.jse.JseSample;


/**
 * 正则表达式样例.
 * 
 * <p><b><code>java.util.regex.Matcher</code></b>
 * <ul>
 * <li>{@link #appendReplacement_Matcher() appendReplacement}方法的使用</li>
 * </ul>
 * 
 * @author Phil
 * @date 2013-1-23 上午11:00:45
 */
public class RegexExpressionSample extends JseSample {

	
	/**
	 * <code>appendReplacement</code>的使用方法.
	 * 
	 * <p><code>appendReplacement</code>使用一个<code>StringBuffer</code>来缓存替换的字符串。
	 * <code>appendReplacement</code>就是<code>replaceAll</code>的底层实现
	 * 
	 * <p><b>Note:</b> replacement一般使用<code>Matcher.quoteReplacement</code>来对替换的字符
	 * 串进行特殊字符的转换，<code>$</code>和反斜杠<code>\</code>在替换字符串中没有意义
	 * <br>
	 * 如下例子: 如果替换字符串<code>$dog</code>不使用<code>quoteReplacement</code>方法进行
	 * 转换，将在replace过程中发生异常
	 * 
	 * @author Phil
	 * @date 2013-1-23 下午5:05:23
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
