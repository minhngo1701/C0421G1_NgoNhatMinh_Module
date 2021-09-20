package com.codegym.case_study.model.repository.contract;

import com.codegym.case_study.model.entity.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
