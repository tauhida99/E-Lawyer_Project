package com.learn.online.lawyer.system.service;

import com.learn.online.lawyer.system.entity.Cases;
import com.learn.online.lawyer.system.entity.User;
import com.learn.online.lawyer.system.repository.CasesRepository;
import com.learn.online.lawyer.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  CasesService {

    @Autowired
    private CasesRepository casesRepository;


    public void saveAllCasesRegistered(Cases cases) {
        casesRepository.save(cases);
    }

    public List<Cases> showAllcases() {
       return casesRepository.findAll();

    }
}
