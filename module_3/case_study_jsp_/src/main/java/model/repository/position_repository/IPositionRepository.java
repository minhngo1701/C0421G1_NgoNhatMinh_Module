package model.repository.position_repository;

import model.bean.employee.Position;

import java.util.List;

public interface IPositionRepository {
    List<Position> findAll();
}
