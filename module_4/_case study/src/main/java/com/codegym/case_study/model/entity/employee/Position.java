package com.codegym.case_study.model.entity.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namePosition;

    @OneToMany(mappedBy = "position")
    private Set<Employee> employees;

    public Position() {
    }


    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getNamePosition() {
        return namePosition;
    }


}
