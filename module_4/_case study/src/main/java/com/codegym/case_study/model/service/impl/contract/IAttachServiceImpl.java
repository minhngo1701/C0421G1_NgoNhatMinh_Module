package com.codegym.case_study.model.service.impl.contract;

import com.codegym.case_study.model.entity.contract.AttachService;
import com.codegym.case_study.model.repository.contract.AttachRepository;
import com.codegym.case_study.model.service.contract.IAttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IAttachServiceImpl implements IAttachService {
    @Autowired
    private AttachRepository attachRepository;

    @Override
    public List<AttachService> findAll() {
        return attachRepository.findAll();
    }
}
