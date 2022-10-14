package Enoca.com.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;


@Data
@ToString
@Entity
@JsonIgnoreProperties
@JsonInclude
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "foundation")
    private String foundation;

    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private Set<Employee> employeeList;

    public Company(Long id, String name, Set<Employee> employeeList, String foundation){
        this.id = id;
        this.name = name;
        this.foundation= foundation;
        this.employeeList = employeeList;
    }
    public Company(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public Set<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Set<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
