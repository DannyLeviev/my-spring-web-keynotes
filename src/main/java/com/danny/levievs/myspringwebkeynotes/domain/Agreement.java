package com.danny.levievs.myspringwebkeynotes.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="agreements")
@NoArgsConstructor
public class Agreement {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    @Column(name = "policy_number", nullable = false, length = 20)
    private String policyNumber;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="address_id")
    private Address address;

}
