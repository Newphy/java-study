package cn.newphy.spring.customtag.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class PeopleNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
	}

}
