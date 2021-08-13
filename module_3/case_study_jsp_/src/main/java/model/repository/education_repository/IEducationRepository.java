package model.repository.education_repository;

import model.bean.employee.Education;
import model.bean.employee.Position;

import java.util.List;

public interface IEducationRepository {
    List<Education> findAll();
}
