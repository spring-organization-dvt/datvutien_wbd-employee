package com.thinkpad.datvutienwbdemployeemanagement.repository;

import com.thinkpad.datvutienwbdemployeemanagement.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    Iterable<Employee> findByNameContaining(String word);
}
