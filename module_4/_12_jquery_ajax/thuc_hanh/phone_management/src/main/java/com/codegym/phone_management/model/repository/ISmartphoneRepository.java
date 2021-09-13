package com.codegym.phone_management.model.repository;

import com.codegym.phone_management.model.bean.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone, Long> {
}
