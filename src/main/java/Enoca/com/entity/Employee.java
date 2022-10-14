package Enoca.com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private float salary;
    @Column(name= "hireDate")
    private String hireDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    public Employee(Long id, String name, float salary, String hireDate, Company company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.company = company;
    }

    public Employee() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public Company getCompany() {
        return company;
    }
}
