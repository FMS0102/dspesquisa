package com.fms.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
