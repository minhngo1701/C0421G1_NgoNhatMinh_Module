package model.service.emplyee;

import model.bean.employee.Position;
import model.repository.position_repository.IPositionRepository;
import model.repository.position_repository.PositionRepository;

import java.util.List;

public class PositionServiceImpl implements IPositionService {
    private IPositionRepository iPositionRepository = new PositionRepository();
    @Override
    public List<Position> findAll() {
        return this.iPositionRepository.findAll();
    }
}
