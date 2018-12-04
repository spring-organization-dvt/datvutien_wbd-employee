package com.thinkpad.datvutienwbdemployeemanagement;

import com.thinkpad.datvutienwbdemployeemanagement.service.EmployeeService;
import com.thinkpad.datvutienwbdemployeemanagement.service.EmployeeServiceImpl;
import com.thinkpad.datvutienwbdemployeemanagement.service.GroupEmployeeService;
import com.thinkpad.datvutienwbdemployeemanagement.service.GroupEmployeeServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
//@Configuration
//@EnableJpaRepositories("com.thinkpad.datvutienwbdemployeemanagement.repository")
public class DatVutienWbdEmployeeManagementApplication  {

//	private ApplicationContext applicationContext;
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}

	@Bean
	public GroupEmployeeService groupEmployeeService() {
		return new GroupEmployeeServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(DatVutienWbdEmployeeManagementApplication.class, args);
	}

//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.applicationContext = applicationContext;
//	}

//	@Override
//	public void addFormatters(FormatterRegistry registry) {
//		registry.addFormatter(new com.thinkpad.datvutienwbdemployeemanagement.formatter.GroupEmployeeFormatter((applicationContext.getBean(GroupEmployeeService.class))));
//	}
}
