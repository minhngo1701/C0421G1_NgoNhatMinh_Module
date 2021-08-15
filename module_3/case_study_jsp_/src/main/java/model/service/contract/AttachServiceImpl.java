package model.service.contract;

import model.bean.contract.AttachService;
import model.repository.acttach_service.AttachServiceRepositoryImpl;
import model.repository.acttach_service.IAttachServiceRepository;

import java.util.List;

public class AttachServiceImpl implements IAttachService {
    private IAttachServiceRepository iAttachServiceRepository = new AttachServiceRepositoryImpl();
    @Override
    public List<AttachService> findAll() {
        return this.iAttachServiceRepository.findAll();
    }
}
