package com.thinkpad.datvutienwbdemployeemanagement;

import com.thinkpad.datvutienwbdemployeemanagement.service.EmployeeService;
//import com.thinkpad.datvutienwbdemployeemanagement.service.EmployeeServiceImpl;
//import com.thinkpad.datvutienwbdemployeemanagement.service.GroupEmployeeService;
//import com.thinkpad.datvutienwbdemployeemanagement.service.GroupEmployeeServiceImpl;
import com.thinkpad.datvutienwbdemployeemanagement.service.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatVutienWbdEmployeeManagementApplication {

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}

//	@Bean
//	public GroupEmployeeService groupEmployeeService() {
//		return new GroupEmployeeServiceImpl();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DatVutienWbdEmployeeManagementApplication.class, args);
	}
}
