package com.github.rdj215.Clinical.controller;

import com.github.rdj215.Clinical.model.Study;
import com.github.rdj215.Clinical.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudyController {

    private StudyService studyService;

    @Autowired
    public StudyController(StudyService studyService){
        this.studyService = studyService;
    }

    @RequestMapping("/study")
    public ModelAndView home(Study study){
        System.out.println(study);
        ModelAndView mv = new ModelAndView();
        mv.addObject("study", study);
        mv.setViewName("home");
        return mv;
    }
}

