package cn.newphy.spring.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DogGuardian {
	@Pointcut("execution(* Dog.bite*(..))")
 	public void biteSth() {
	}

	@Before(value = "biteSth()")
	public void handleBite() {
		System.out.println("开始咬东西了");
	}
}
