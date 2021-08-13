package model.service.emplyee;

import model.bean.employee.Education;
import model.bean.employee.Position;

import java.util.List;

public interface IEducationService {
    List<Education> findAll();
}
