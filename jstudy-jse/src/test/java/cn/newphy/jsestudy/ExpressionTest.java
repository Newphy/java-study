package cn.newphy.jsestudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionTest {

	public static void main(String[] args) {
		String text = "1,2,3,4:5,6,7:10,11";
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
}
