package com.codegym.music.model.repository;

import com.codegym.music.model.bean.AppMusic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<AppMusic, Integer> {
}
