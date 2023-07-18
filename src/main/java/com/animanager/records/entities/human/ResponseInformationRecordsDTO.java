package com.animanager.records.entities.human;

import com.animanager.records.entities.human.InformationRecords;
import com.animanager.records.entities.human.Role;

import java.util.UUID;

public record ResponseInformationRecordsDTO(UUID id, String name, String role, String phoneNumber, String ssn, Role recordRole, String zipCode, String addressComplements) {
    public ResponseInformationRecordsDTO(InformationRecords informationRecords){
        this(informationRecords.getId(),
                informationRecords.getFirst_name(),
                informationRecords.getLast_name(),
                informationRecords.getPhone_number(),
                informationRecords.getSsn(),
                informationRecords.getRecord_role(),
                informationRecords.getZip_code(),
                informationRecords.getAddress_complements());
    }


}
