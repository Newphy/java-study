package cn.newphy.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifecycleBeanPostProcessor implements BeanPostProcessor {

	/**
	 * ʵ����BeanPostProcessor�ӿ�
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("6��������LifecycleBeanPostProcessor��postProcessBeforeInitialization()");
		System.out.println("   ����" + beanName + "��ʼʵ����");
		return bean;
	}
	

	/**
	 * ʵ����BeanPostProcessor�ӿ�
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("9��������LifecycleBeanPostProcessor��postProcessAfterInitialization()");
		System.out.println("   ����" + beanName + "ʵ�������");
		return bean;
	}

}
