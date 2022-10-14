package Enoca.com.dao;

import Enoca.com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

public class EmployeeDao implements IEmployeeDao{
    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public void create(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public void update(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public void destroy(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }
}
