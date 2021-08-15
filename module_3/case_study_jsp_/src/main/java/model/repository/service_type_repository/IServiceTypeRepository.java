package model.repository.service_type_repository;

import model.bean.service_model.ServiceType;

import java.util.List;

public interface IServiceTypeRepository {
    List<ServiceType> findAll();
}
