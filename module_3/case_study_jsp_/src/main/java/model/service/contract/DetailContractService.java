package model.service.contract;

import model.bean.contract.DetailContract;
import model.repository.detail_contract_repository.DetailContractRepositoryImpl;
import model.repository.detail_contract_repository.IDetailContractRepository;

public class DetailContractService implements IDetailContractService {
    private IDetailContractRepository iDetailContractRepository = new DetailContractRepositoryImpl();
    @Override
    public void createDetailContract(DetailContract detailContract) {
        this.iDetailContractRepository.createDetailContract(detailContract);
    }
}
