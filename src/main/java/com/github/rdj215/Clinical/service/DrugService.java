package com.github.rdj215.Clinical.service;

import com.github.rdj215.Clinical.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrugService {

    private DrugRepository drugRepository;

    @Autowired
    public DrugService(DrugRepository repository){
        this.drugRepository = repository;
    }

}
