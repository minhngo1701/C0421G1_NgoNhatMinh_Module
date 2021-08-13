package model.service.emplyee;

import model.bean.employee.Education;
import model.repository.education_repository.EducationRepository;
import model.repository.education_repository.IEducationRepository;
import model.repository.position_repository.IPositionRepository;
import model.repository.position_repository.PositionRepository;

import java.util.List;

public class EducationServiceImpl implements IEducationService {
    private IEducationRepository iEducationRepository = new EducationRepository();
    @Override
    public List<Education> findAll() {
        return this.iEducationRepository.findAll();
    }
}
