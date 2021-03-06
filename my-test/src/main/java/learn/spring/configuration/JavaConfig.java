package learn.spring.configuration;

import learn.spring.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JavaConfig {
	@Bean
	public User user() {
		return new User("001", "wf");
	}
}