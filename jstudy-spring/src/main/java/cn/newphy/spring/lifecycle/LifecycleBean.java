package cn.newphy.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ApplicationContext����Spring Bean����������.
 * <ul>
 * <li><b>1��Bean�Ľ�����</b>����Ѱ��Bean�Ķ�����Ϣ������ʵ����.</li>
 * <li><b>2������ע�룺</b>ʹ������ע�룬Spring����Bean������Ϣ����Bean��������</li>
 * <li><b>3��BeanNameAware��setBeanName()��</b>���Bean����ʵ��org.springframework.beans.BeanNameAware�ӿڣ���������Bean��setBeanName()��������Bean��ID</li>
 * <li><b>4��BeanFactoryAware��setBeanFactory()��</b>���Bean����ʵ��org.springframework.beans.factory.BeanFactoryAware�ӿڣ���������setBeanFactory()�������빤������</li>
 * <li><b>5��ApplicationContextAware��setApplicationContext()��</b>���Bean����ʵ��ApplicationContextAware�ӿڣ�����setApplicationContext()��������ApplicationContext</li>
 * <li><b>6��BeanPostProcessors��ProcessBeforeInitialization()��</b>�����org.springframework.beans.factory.config.BeanPostProcessors��Bean��������ô��postProcessBeforeInitialization()���������������á�</li>
 * <li><b>7��InitializingBean��afterPropertiesSet()��</b>���Bean����ʵ��org.springframework.beans.factory.InitializingBean�ӿڣ���ִ������afterProPertiesSet()����</li>
 * <li><b>8��Bean�����ļ��ж���init-method��</b>������Bean�����ļ���ʹ��"init-method"�����趨�ķ���</li>
 * <li><b>9��BeanPostProcessors��ProcessaAfterInitialization()��</b>������κε�BeanPostProcessorsʵ����Beanʵ����������ִ��BeanPostProcessorsʵ����ProcessaAfterInitialization()����</li>
 * <li><b>10��ϵͳʹ�ý׶Σ�</b> ��ʱ��Bean�Ѿ����Ա�Ӧ��ϵͳʹ�ã����ҽ�������BeanFactory��֪�������ڱ�ʹ��</li>
 * <li><b>11��DisposableBean��destroy()��</b>�������ر�ʱ�����Bean����ʵ��org.springframework.beans.factory.DisposableBean�ӿڣ���ִ������destroy()����</li>
 * <li><b>12��Bean�����ļ��ж���destroy-method��</b>�������ر�ʱ��������Bean�����ļ���ʹ��"destroy-method"�����趨�ķ���</li>
 * </ul>
 * 
 * @author Phil
 * @date 2013-2-4 ����3:43:42
 */
public class LifecycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
		InitializingBean, DisposableBean {

	private String name;

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		System.out.println("2������������ע�뷽��");
		this.name = name;
	}

	/**
	 * ʵ����BeanNameAware�ӿ�
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("3��������BeanNameAware�ӿڵ�setBeanName����");
	}

	/**
	 * ʵ����BeanFactoryAware�ӿ�
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4��������BeanNameAware�ӿڵ�setBeanName����");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("5��������ApplicationContextAware��setApplicationContext()");
	}


	/**
	 * ʵ����InitializingBean�ӿ�
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7��������InitializingBean��afterPropertiesSet()����");
	}

	/**
	 * init-method
	 * 
	 * @author Phil
	 * @date 2013-2-4 ����4:08:25
	 */
	public void initMethod() {
		System.out.println("8��������Bean�����ļ��ж���init-method");
	}


	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("10: ϵͳ����ʱ��ʹ�÷���");
		return name;
	}	

	/**
	 * ʵ����DisposableBean�ӿ�
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("11��������DisposableBean��destroy()����");

	}

	/**
	 * destroy-method
	 */
	public void destroyMethod() {
		System.out.println("12��������Bean�����ļ��ж���destroy-method");

	}

}
