package cn.newphy.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifecycleBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 实现了BeanPostProcessor接口
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("6：调用了LifecycleBeanPostProcessor的postProcessBeforeInitialization()");
		System.out.println("   对象" + beanName + "开始实例化");
		return bean;
	}
	

	/**
	 * 实现了BeanPostProcessor接口
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("9：调用了LifecycleBeanPostProcessor的postProcessAfterInitialization()");
		System.out.println("   对象" + beanName + "实例化完成");
		return bean;
	}

}
