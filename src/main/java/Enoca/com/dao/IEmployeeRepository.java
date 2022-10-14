package Enoca.com.dao;

import Enoca.com.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {


}
