package model.repository.division_repository;

import model.bean.employee.Division;
import model.bean.employee.Position;

import java.util.List;

public interface IDivisionRepository {
    List<Division> findAll();
}
