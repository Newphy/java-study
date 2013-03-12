package cn.newphy.spring.customtag.schema;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import cn.newphy.spring.customtag.PeopleConfig;

public class PeopleBeanDefinitionParser implements BeanDefinitionParser {

	@Override
	public BeanDefinition parse(Element element, ParserContext context) {
		RootBeanDefinition beanDefinition = new RootBeanDefinition();
		beanDefinition.setBeanClass(PeopleConfig.class);
		beanDefinition.setLazyInit(false);
        String id = element.getAttribute("id");  
        if (StringUtils.hasText(id)) {  
        	beanDefinition.getPropertyValues().addPropertyValue("id", id);  
        }  
        
        String name = element.getAttribute("name");  
        if (StringUtils.hasText(name)) {  
        	beanDefinition.getPropertyValues().addPropertyValue("name", name);  
        }  
        
        String age = element.getAttribute("age");  
        if (StringUtils.hasText(age)) {  
        	beanDefinition.getPropertyValues().addPropertyValue("age", Integer.valueOf(age));  
        }  
        
        context.getRegistry().registerBeanDefinition(id, beanDefinition);
        return beanDefinition;
	}

}
