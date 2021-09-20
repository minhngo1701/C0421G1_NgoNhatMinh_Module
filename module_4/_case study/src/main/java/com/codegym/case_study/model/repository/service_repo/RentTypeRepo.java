package com.codegym.case_study.model.repository.service_repo;

import com.codegym.case_study.model.entity.service_entity.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTypeRepo extends JpaRepository<RentType, Long> {
}
