package bai2.healthinfo.model.repository;

import bai2.healthinfo.model.bean.Health;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class HealthInfoRepositoryImpl implements HealthInfoRepository{

    @Override
    public void save(Health health) {
        List<Health> healthList =  new ArrayList<>();
        healthList.add(health);
    }
}
