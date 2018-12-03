//package com.thinkpad.datvutienwbdemployeemanagement.formatter;
//
//import com.thinkpad.datvutienwbdemployeemanagement.model.GroupEmployee;
//import com.thinkpad.datvutienwbdemployeemanagement.service.GroupEmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.Formatter;
//import org.springframework.stereotype.Component;
//
//import java.text.ParseException;
//import java.util.Locale;
//
//@Component
//public class GroupEmployeeFormatter implements Formatter<GroupEmployee> {
//    private GroupEmployeeService groupEmployeeService;
//
//    @Autowired
//    public GroupEmployeeFormatter(GroupEmployeeService groupEmployeeService) {
//        this.groupEmployeeService = groupEmployeeService;
//    }
//
//    @Override
//    public GroupEmployee parse(String text, Locale locale) throws ParseException {
////        Integer integer = Integer.valueOf(text);
//        return groupEmployeeService.findById(text);
//    }
//
//    @Override
//    public String print(GroupEmployee object, Locale locale) {
//        return "[" + object.getId() + ", " + object.getName() + "]";
//    }
//
//}
