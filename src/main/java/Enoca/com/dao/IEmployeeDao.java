package Enoca.com.dao;

import Enoca.com.entity.Employee;

import java.util.List;

public interface IEmployeeDao {
    void create(Employee e);
    void update(Employee e);
    void destroy(Long id);
    List <Employee> listAll();
}
