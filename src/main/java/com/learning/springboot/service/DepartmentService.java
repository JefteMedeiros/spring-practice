package com.learning.springboot.service;

import com.learning.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> listDepartments();

    public Department getDepartmentById(Long departmentId);
}
