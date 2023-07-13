package com.animanager.records.entities.dto;

import com.animanager.records.entities.Role;

public record RequestInformationRecordsDTO(String first_name, String last_name, String phone_number, String ssn, Role record_role, String zip_code, String address_complements) {
}