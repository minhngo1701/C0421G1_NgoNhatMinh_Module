package model.repository.service_repository;

import model.bean.service_model.Service;

import java.util.List;

public interface IServiceRepository {
    List<Service> findAll();
    void create(Service service);
}
