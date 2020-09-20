package learn.spring;

import learn.spring.configuration.JavaConfig;
import learn.spring.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ATest {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}