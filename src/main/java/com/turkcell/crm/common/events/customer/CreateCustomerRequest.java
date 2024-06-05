package com.turkcell.crm.common.events.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCustomerRequest {
    private String firstName;

    private String email;

    private String middleName;

    private String lastName;

    private LocalDate birthDate;

    private String fatherName;

    private String motherName;

    private String motherMaidenName;

    private String nationalityId;

    private int id;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private LocalDateTime deletedDate;

    private Boolean active;

    private String mobilePhoneNumber;

    private String homePhoneNumber;
}
