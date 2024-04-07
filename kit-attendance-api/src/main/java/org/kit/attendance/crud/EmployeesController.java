package org.kit.attendance.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeesController {

    @Autowired
    private EmployeesRepository employeesRepository;

    @PostMapping("/insert")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeesRepository.save(employee);
    }
}

