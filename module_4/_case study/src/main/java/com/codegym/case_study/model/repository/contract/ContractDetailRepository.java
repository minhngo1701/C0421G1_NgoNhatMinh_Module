package com.codegym.case_study.model.repository.contract;

import com.codegym.case_study.model.entity.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDetailRepository extends JpaRepository<ContractDetail, Long> {
}
