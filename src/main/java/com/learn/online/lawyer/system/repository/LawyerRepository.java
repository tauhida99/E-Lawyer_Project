package com.learn.online.lawyer.system.repository;

import com.learn.online.lawyer.system.entity.Cases;
import com.learn.online.lawyer.system.entity.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawyerRepository extends JpaRepository<Lawyer, Integer> {
}
