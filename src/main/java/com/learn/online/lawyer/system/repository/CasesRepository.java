package com.learn.online.lawyer.system.repository;

import com.learn.online.lawyer.system.entity.Cases;
import com.learn.online.lawyer.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasesRepository extends JpaRepository<Cases, Integer> {
}
