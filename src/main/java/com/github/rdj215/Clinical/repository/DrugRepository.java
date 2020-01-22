package com.github.rdj215.Clinical.repository;

import com.github.rdj215.Clinical.model.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DrugRepository extends JpaRepository<Drug, UUID> {
}
