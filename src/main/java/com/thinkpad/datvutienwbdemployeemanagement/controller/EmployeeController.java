package com.thinkpad.datvutienwbdemployeemanagement.controller;

import com.thinkpad.datvutienwbdemployeemanagement.model.Employee;
import com.thinkpad.datvutienwbdemployeemanagement.model.GroupEmployee;
import com.thinkpad.datvutienwbdemployeemanagement.service.EmployeeService;
import com.thinkpad.datvutienwbdemployeemanagement.service.GroupEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private GroupEmployeeService groupEmployeeService;

    @ModelAttribute("groupEmployees")
    public Iterable<GroupEmployee> groupEmployees() {
        return groupEmployeeService.findAll();
    }

    @GetMapping("/employees")
    public ModelAndView listEmployee() {
        Iterable<Employee> list = employeeService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("employees", list);
        return modelAndView;
    }

    @GetMapping("/create-employee")
    public ModelAndView showCreateEmployee() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @PostMapping("/create-employee")
    public ModelAndView createEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("message", "New Employee created successfully!");
        return modelAndView;
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Optional<Employee> employee = employeeService.findById(id);
        if (employee != null) {
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("employee", employee);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-employee")
    public ModelAndView updateEmploy(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("message", "Employee updated successfully!");
        return modelAndView;
    }

    @GetMapping("/delete-employee/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Optional<Employee> employee = employeeService.findById(id);
        if (employee.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("employee", employee);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-employee")
    public ModelAndView deleteEmploy(@ModelAttribute("employee") Employee employee) {
        employeeService.remove(employee);
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Employee> employees = employeeService.findAll();
        modelAndView.addObject("employees", employees);
        modelAndView.addObject("message", "Employee deleted successfully!");
        return modelAndView;
    }

    @PostMapping("/search")
    public ModelAndView search(@RequestParam("word") String word) {
        Iterable<Employee> employees = employeeService.search(word);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

}
