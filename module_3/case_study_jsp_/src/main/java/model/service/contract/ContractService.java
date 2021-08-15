package model.service.contract;

import model.bean.contract.Contract;
import model.repository.contract_repository.ContractRepositoryImpl;
import model.repository.contract_repository.IContractRepository;

import java.util.List;

public class ContractService implements IContractService {
    private IContractRepository iContractRepository = new ContractRepositoryImpl();
    @Override
    public List<Contract> findAll() {
        return this.iContractRepository.findAll();
    }

    @Override
    public void createContract(Contract contract) {
        this.iContractRepository.createContract(contract);
    }
}
