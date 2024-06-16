package com.vignesh.department_service.controller;

import com.vignesh.department_service.model.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @GetMapping("/get")
    public ResponseEntity<Department> getEmployee() {
        Department dept = Department.builder().id(1).departmentName("test").build();
        log.info("Fetching department");
        return new ResponseEntity<>(dept, HttpStatus.OK);
    }
}
