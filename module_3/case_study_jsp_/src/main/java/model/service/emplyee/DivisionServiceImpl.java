package model.service.emplyee;

import model.bean.employee.Division;
import model.repository.division_repository.DivisionRepository;
import model.repository.division_repository.IDivisionRepository;

import java.util.List;

public class DivisionServiceImpl implements IDivisionService {
    private IDivisionRepository iDivisionRepository = new DivisionRepository();
    @Override
    public List<Division> findAll() {
        return this.iDivisionRepository.findAll();
    }
}
