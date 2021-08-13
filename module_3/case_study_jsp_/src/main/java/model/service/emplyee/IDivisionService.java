package model.service.emplyee;

import model.bean.employee.Division;
import model.bean.employee.Position;

import java.util.List;

public interface IDivisionService {
    List<Division> findAll();
}
