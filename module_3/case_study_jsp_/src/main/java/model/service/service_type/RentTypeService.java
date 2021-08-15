package model.service.service_type;

import model.bean.service_model.RentType;
import model.repository.service_type_repository.IRentTypeRepository;
import model.repository.service_type_repository.RentTypeRepository;

import java.util.List;

public class RentTypeService implements IRentTypeService {
    private IRentTypeRepository iRentTypeRepository = new RentTypeRepository();
    @Override
    public List<RentType> findAll() {
        return this.iRentTypeRepository.findAll();
    }
}
