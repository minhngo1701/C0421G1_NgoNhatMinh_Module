package model.service.service_ser;

import model.bean.service_model.Service;
import model.repository.service_repository.IServiceRepository;
import model.repository.service_repository.ServiceRepositoryImpl;

import java.util.List;

public class ServiceImpl implements IService {
    private IServiceRepository iServiceRepository = new ServiceRepositoryImpl();

    @Override
    public List<Service> findAll() {
        return this.iServiceRepository.findAll();
    }

    @Override
    public void create(Service service) {
        this.iServiceRepository.create(service);
    }
}
