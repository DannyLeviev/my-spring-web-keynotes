package com.danny.levievs.myspringwebkeynotes.model;

import java.time.LocalDate;

public record CustomerDto(Long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, Boolean active) {
}
