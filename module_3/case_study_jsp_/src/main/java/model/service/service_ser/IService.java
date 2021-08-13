package model.service.service_ser;

import model.bean.service_model.Service;

import java.util.List;

public interface IService {
    List<Service> findAll();
    void create(Service service);
}
