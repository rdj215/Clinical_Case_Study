package com.github.rdj215.Clinical.repository;

import com.github.rdj215.Clinical.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudyRepository extends JpaRepository<Study, UUID> {

}
