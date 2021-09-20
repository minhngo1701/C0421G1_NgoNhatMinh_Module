package com.codegym.case_study.model.repository.contract;

import com.codegym.case_study.model.entity.contract.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachRepository extends JpaRepository<AttachService, Long> {
}
