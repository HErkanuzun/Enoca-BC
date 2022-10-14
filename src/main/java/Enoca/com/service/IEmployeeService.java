package Enoca.com.service;

import Enoca.com.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    void create(Employee employee);
    void update(Employee employee);
    void destroy(Long id);
    Employee getEmployeeById(Long id);

    List<Employee> listAll();
}
