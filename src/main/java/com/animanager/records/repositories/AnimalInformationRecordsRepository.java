package com.animanager.records.repositories;

import com.animanager.records.entities.AnimalInformationRecords;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimalInformationRecordsRepository extends JpaRepository<AnimalInformationRecords, UUID> {
}
