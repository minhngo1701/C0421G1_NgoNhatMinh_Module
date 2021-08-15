package model.repository.service_type_repository;

import model.bean.service_model.RentType;

import java.util.List;

public interface IRentTypeRepository {
    List<RentType> findAll();
}
