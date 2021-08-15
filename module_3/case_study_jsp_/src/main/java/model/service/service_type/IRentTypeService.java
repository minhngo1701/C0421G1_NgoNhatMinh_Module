package model.service.service_type;

import model.bean.service_model.RentType;

import java.util.List;

public interface IRentTypeService {
    List<RentType> findAll();
}
