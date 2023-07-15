package com.animanager.records.config;

import com.animanager.records.entities.AnimalInformationRecords;
import com.animanager.records.entities.Gender;
import com.animanager.records.entities.InformationRecords;
import com.animanager.records.entities.Role;
import com.animanager.records.repositories.AnimalInformationRecordsRepository;
import com.animanager.records.repositories.InformationRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private InformationRecordsRepository informationRecordsRepository;

    @Autowired
    private AnimalInformationRecordsRepository animalInformationRecordsRepository;

    @Override
    public void run(String... args) throws Exception {
        InformationRecords ir1 = new InformationRecords(null, Role.CAREGIVER, "Gabriel", "Mediotti", "11999999999", "99999999999", "99999999", "845, ap92", null);
        InformationRecords ir2 = new InformationRecords(null, Role.EMPLOYEE, "Giulia", "Pugliesi", "11999999999", "89999999999", "99999999", "81", null);
        informationRecordsRepository.saveAll(Arrays.asList(ir1, ir2));



        AnimalInformationRecords pt1 = new AnimalInformationRecords(null, Gender.MALE, "Brutus", "4", "Dog", "English Bulldog", true, "none", "none", ir1);
        AnimalInformationRecords pt2 = new AnimalInformationRecords(null, Gender.FEMALE, "Luna", "13", "Dog", "Poodle", true, "none", "none", ir2);
        animalInformationRecordsRepository.saveAll(Arrays.asList(pt1, pt2));
    }
}
