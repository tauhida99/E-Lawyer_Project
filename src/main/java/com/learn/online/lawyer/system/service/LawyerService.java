package com.learn.online.lawyer.system.service;

import com.learn.online.lawyer.system.entity.Cases;
import com.learn.online.lawyer.system.entity.Lawyer;
import com.learn.online.lawyer.system.repository.CasesRepository;
import com.learn.online.lawyer.system.repository.LawyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LawyerService {
    @Autowired
    private LawyerRepository lawyerRepository;


    public void saveAllLawyerDetails(Lawyer lawyer) {
        lawyerRepository.save(lawyer);
    }
}
