package model.service.contract;

import model.bean.contract.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();
    void createContract(Contract contract);
}
