package model.service.emplyee;

import model.bean.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
}
