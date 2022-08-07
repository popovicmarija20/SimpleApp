package com.SimpleApp.service.impl;

import com.SimpleApp.repository.EmployeeRepository;
import com.SimpleApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<String> getAllEmployeeNames(String surname) {
        return employeeRepository.findAllByEmployeeNames(surname);
    }
}
