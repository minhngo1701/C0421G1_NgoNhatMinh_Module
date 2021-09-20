package com.codegym.case_study.model.repository.service_repo;

import com.codegym.case_study.model.entity.service_entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceTypeRepo extends JpaRepository<ServiceType, Long> {

}
