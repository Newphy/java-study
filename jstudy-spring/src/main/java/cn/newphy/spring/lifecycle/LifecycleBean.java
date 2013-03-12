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
 * ApplicationContext管理Spring Bean的生命周期.
 * <ul>
 * <li><b>1：Bean的建立：</b>容器寻找Bean的定义信息并将其实例化.</li>
 * <li><b>2：属性注入：</b>使用依赖注入，Spring按照Bean定义信息配置Bean所有属性</li>
 * <li><b>3：BeanNameAware的setBeanName()：</b>如果Bean类有实现org.springframework.beans.BeanNameAware接口，工厂调用Bean的setBeanName()方法传递Bean的ID</li>
 * <li><b>4：BeanFactoryAware的setBeanFactory()：</b>如果Bean类有实现org.springframework.beans.factory.BeanFactoryAware接口，工厂调用setBeanFactory()方法传入工厂自身</li>
 * <li><b>5：ApplicationContextAware的setApplicationContext()：</b>如果Bean类有实现ApplicationContextAware接口，调用setApplicationContext()方法传入ApplicationContext</li>
 * <li><b>6：BeanPostProcessors的ProcessBeforeInitialization()：</b>如果有org.springframework.beans.factory.config.BeanPostProcessors和Bean关联，那么其postProcessBeforeInitialization()方法将被将被调用。</li>
 * <li><b>7：InitializingBean的afterPropertiesSet()：</b>如果Bean类已实现org.springframework.beans.factory.InitializingBean接口，则执行他的afterProPertiesSet()方法</li>
 * <li><b>8：Bean定义文件中定义init-method：</b>可以在Bean定义文件中使用"init-method"属性设定的方法</li>
 * <li><b>9：BeanPostProcessors的ProcessaAfterInitialization()：</b>如果有任何的BeanPostProcessors实例与Bean实例关联，则执行BeanPostProcessors实例的ProcessaAfterInitialization()方法</li>
 * <li><b>10：系统使用阶段：</b> 此时，Bean已经可以被应用系统使用，并且将保留在BeanFactory中知道它不在被使用</li>
 * <li><b>11：DisposableBean的destroy()：</b>在容器关闭时，如果Bean类有实现org.springframework.beans.factory.DisposableBean接口，则执行他的destroy()方法</li>
 * <li><b>12：Bean定义文件中定义destroy-method：</b>在容器关闭时，可以在Bean定义文件中使用"destroy-method"属性设定的方法</li>
 * </ul>
 * 
 * @author Phil
 * @date 2013-2-4 下午3:43:42
 */
public class LifecycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
		InitializingBean, DisposableBean {

	private String name;

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		System.out.println("2：调用了属性注入方法");
		this.name = name;
	}

	/**
	 * 实现了BeanNameAware接口
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("3：调用了BeanNameAware接口的setBeanName方法");
	}

	/**
	 * 实现了BeanFactoryAware接口
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4：调用了BeanNameAware接口的setBeanName方法");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("5：调用了ApplicationContextAware的setApplicationContext()");
	}


	/**
	 * 实现了InitializingBean接口
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7：调用了InitializingBean的afterPropertiesSet()方法");
	}

	/**
	 * init-method
	 * 
	 * @author Phil
	 * @date 2013-2-4 下午4:08:25
	 */
	public void initMethod() {
		System.out.println("8：调用了Bean定义文件中定义init-method");
	}


	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("10: 系统运行时的使用方法");
		return name;
	}	

	/**
	 * 实现了DisposableBean接口
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("11：调用了DisposableBean的destroy()方法");

	}

	/**
	 * destroy-method
	 */
	public void destroyMethod() {
		System.out.println("12：调用了Bean定义文件中定义destroy-method");

	}

}
