package com.codegym.case_study.model.service.contract;

import com.codegym.case_study.model.entity.contract.AttachService;

import java.util.List;

public interface IAttachService {
    List<AttachService> findAll();
}
