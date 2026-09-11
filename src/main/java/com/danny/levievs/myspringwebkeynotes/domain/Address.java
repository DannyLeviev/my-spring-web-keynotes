package com.danny.levievs.myspringwebkeynotes.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="address")
@NoArgsConstructor
public class Address {

    @Id
    @Column
    private Long id;

    @Column(name="street_name", nullable = false, length = 100)
    private String streetName;

    @Column(name="city", nullable = false, length = 15)
    private String city;

    @Column(name="country", nullable = false, length = 15)
    private String country;

}
