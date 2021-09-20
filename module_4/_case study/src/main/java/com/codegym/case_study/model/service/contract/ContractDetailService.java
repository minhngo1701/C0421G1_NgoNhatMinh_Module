package com.codegym.case_study.model.service.contract;

import com.codegym.case_study.model.entity.contract.ContractDetail;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> findAll();
    void save(ContractDetail contractDetail);
}
