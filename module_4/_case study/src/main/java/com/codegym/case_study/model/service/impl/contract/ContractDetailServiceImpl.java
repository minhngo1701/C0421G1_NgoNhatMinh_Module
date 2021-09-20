package com.codegym.case_study.model.service.impl.contract;

import com.codegym.case_study.model.entity.contract.ContractDetail;
import com.codegym.case_study.model.repository.contract.ContractDetailRepository;
import com.codegym.case_study.model.service.contract.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    private ContractDetailRepository contractDetailRepository;
    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }
}
