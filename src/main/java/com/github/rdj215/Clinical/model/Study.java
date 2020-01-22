package com.github.rdj215.Clinical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Study {
    @Id @GeneratedValue
    public final Integer studyId;
    public String studyName;

    public Study(Integer studyId) {
        this.studyId = studyId;
    }

    @Override
    public String toString() {
        return "Study{" +
                "studyId=" + studyId +
                ", studyName='" + studyName + '\'' +
                '}';
    }
}
