package com.animanager.records.repositories;

import com.animanager.records.entities.human.InformationRecords;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InformationRecordsRepository extends JpaRepository<InformationRecords, UUID> {
}
