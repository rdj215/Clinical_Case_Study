package com.github.rdj215.Clinical.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Drug {
    @Id
    private final UUID drugId = UUID.randomUUID();
    private String drugName;

}
