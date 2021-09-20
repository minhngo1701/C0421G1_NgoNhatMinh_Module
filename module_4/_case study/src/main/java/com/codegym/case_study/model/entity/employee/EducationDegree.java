package com.codegym.case_study.model.entity.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EducationDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameEducationDegree;

    @OneToMany(mappedBy = "educationDegree")
    private Set<Employee> employees;

    public EducationDegree() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}
