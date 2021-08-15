package model.service.service_type;

import model.bean.service_model.ServiceType;
import model.repository.service_repository.IServiceRepository;
import model.repository.service_repository.ServiceRepositoryImpl;
import model.repository.service_type_repository.IServiceTypeRepository;
import model.repository.service_type_repository.ServiceTypeRepositoryImpl;

import java.util.List;

public class ServiceTypeImpl implements IServiceType{
    private IServiceTypeRepository iServiceTypeRepository = new ServiceTypeRepositoryImpl();
    @Override
    public List<ServiceType> findAll() {
        return this.iServiceTypeRepository.findAll();
    }
}
