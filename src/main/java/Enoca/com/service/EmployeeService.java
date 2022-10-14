package Enoca.com.service;

import Enoca.com.dao.IEmployeeDao;
import Enoca.com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    IEmployeeDao employeeDao;


    @Override
    public void create(Employee employee) {
        employeeDao.create(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void destroy(Long id) {
        employeeDao.destroy(id);
    }

    @Override
    public Employee getEmployeeById(Long id) {

        return employeeDao.getEmployeeById(id);
    }

    @Override
    public List<Employee> listAll() {
        return employeeDao.listAll();
    }
}
