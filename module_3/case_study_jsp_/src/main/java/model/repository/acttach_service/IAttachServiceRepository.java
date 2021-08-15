package model.repository.acttach_service;

import model.bean.contract.AttachService;

import java.util.List;

public interface IAttachServiceRepository {
    List<AttachService> findAll();
}
