package com.animanager.records.config;

import com.animanager.records.entities.InformationRecords;
import com.animanager.records.entities.Role;
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

    @Override
    public void run(String... args) throws Exception {
        InformationRecords ir1 = new InformationRecords(null, Role.CAREGIVER, "Gabriel", "Mediotti", "11999999999", "99999999999", "99999999", "845, ap92");
        InformationRecords ir2 = new InformationRecords(null, Role.EMPLOYEE, "Giulia", "Pugliesi", "11999999999", "89999999999", "99999999", "81");
        informationRecordsRepository.saveAll(Arrays.asList(ir1, ir2));
    }
}
