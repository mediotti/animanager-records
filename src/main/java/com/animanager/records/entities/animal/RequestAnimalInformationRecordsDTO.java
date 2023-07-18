package com.animanager.records.entities.animal;

import com.animanager.records.entities.animal.Gender;

public record RequestAnimalInformationRecordsDTO(Gender gender, String name, String age, String species, String breed, Boolean neutered, String vaccination_records, String procedures_records) {
}