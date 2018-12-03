package com.thinkpad.datvutienwbdemployeemanagement.service;

import com.thinkpad.datvutienwbdemployeemanagement.model.Employee;

import java.util.Optional;

public interface EmployeeService {
    Iterable<Employee> findAll();
    Optional<Employee> findById(Integer id);

    void save(Employee employee);

    void remove(Employee employee);

    Iterable<Employee> search(String word);

}
