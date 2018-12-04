package com.thinkpad.datvutienwbdemployeemanagement.service;

import com.thinkpad.datvutienwbdemployeemanagement.model.GroupEmployee;

import java.util.Optional;

public interface GroupEmployeeService {
    Iterable<GroupEmployee> findAll();
    Optional<GroupEmployee> findById(Integer id);

    void save(GroupEmployee groupEmployee);

    void remove(GroupEmployee groupEmployee);
}
