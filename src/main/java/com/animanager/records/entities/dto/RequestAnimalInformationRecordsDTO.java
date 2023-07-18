package com.animanager.records.entities.dto;

import com.animanager.records.entities.Gender;

public record RequestAnimalInformationRecordsDTO(Gender gender, String name, String age, String species, String breed, Boolean neutered, String vaccination_records, String procedures_records) {
}