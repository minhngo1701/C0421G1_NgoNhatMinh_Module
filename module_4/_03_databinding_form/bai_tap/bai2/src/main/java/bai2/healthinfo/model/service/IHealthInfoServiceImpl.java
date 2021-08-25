package bai2.healthinfo.model.service;

import bai2.healthinfo.model.bean.Health;
import bai2.healthinfo.model.repository.HealthInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IHealthInfoServiceImpl implements IHealthInfoService {
    @Autowired
    private HealthInfoRepository healthInfoRepository;
    @Override
    public void save(Health health) {
        healthInfoRepository.save(health);
    }
}
