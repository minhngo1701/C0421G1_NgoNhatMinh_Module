package com.codegym.case_study.dto;

import com.codegym.case_study.model.entity.contract.AttachService;
import com.codegym.case_study.model.entity.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Min;

public class ContractDetailDto {
    private Long id;
    @Min(value = 0, message = "quantity must positive")
    private int quantity;
    private Contract contract;
    private AttachService attachService;

    public ContractDetailDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}
