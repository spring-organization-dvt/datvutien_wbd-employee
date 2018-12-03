package com.thinkpad.datvutienwbdemployeemanagement.service;

import com.thinkpad.datvutienwbdemployeemanagement.model.Employee;
import com.thinkpad.datvutienwbdemployeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Iterable<Employee> search(String word) {
        return employeeRepository.findByNameContaining(word);
    }

}
