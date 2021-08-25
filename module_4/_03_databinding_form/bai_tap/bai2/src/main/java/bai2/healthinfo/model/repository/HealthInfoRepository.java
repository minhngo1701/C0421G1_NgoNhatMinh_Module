package bai2.healthinfo.model.repository;

import bai2.healthinfo.model.bean.Health;

import java.util.List;

public interface HealthInfoRepository {
    void save(Health health);
}
