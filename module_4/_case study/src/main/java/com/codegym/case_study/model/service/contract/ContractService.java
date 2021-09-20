package com.codegym.case_study.model.service.contract;

import com.codegym.case_study.model.entity.contract.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> findAll();
    void save(Contract contract);
}
