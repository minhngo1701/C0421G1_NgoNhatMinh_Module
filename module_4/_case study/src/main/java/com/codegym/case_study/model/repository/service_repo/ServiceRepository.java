package com.codegym.case_study.model.repository.service_repo;

import com.codegym.case_study.model.entity.service_entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
