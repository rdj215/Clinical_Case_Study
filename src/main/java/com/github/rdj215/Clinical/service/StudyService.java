package com.github.rdj215.Clinical.service;

import com.github.rdj215.Clinical.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService {

    private StudyRepository studyRepository;

    @Autowired
    public StudyService(StudyRepository studyRepository){
        this.studyRepository = studyRepository;
    }


}
