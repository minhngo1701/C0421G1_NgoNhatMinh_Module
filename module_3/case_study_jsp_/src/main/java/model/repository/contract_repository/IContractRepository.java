package model.repository.contract_repository;

import model.bean.contract.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> findAll();
    void createContract(Contract contract);
}
