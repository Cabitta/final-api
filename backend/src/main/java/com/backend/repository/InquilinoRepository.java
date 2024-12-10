package com.backend.repository;

import com.backend.entity.InquilinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface InquilinoRepository extends JpaRepository<InquilinoEntity, Long> {

    List<InquilinoEntity> findAll();
}
