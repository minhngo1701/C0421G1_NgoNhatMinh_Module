package com.codegym.model.repository;

import com.codegym.model.bean.Mail;

import java.util.List;

public interface MailRepository {
    List<Mail> findAll();
}
