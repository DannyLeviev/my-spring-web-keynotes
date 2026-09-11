package com.danny.levievs.myspringwebkeynotes.repository;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgreementsRepository extends JpaRepository<Agreement, Long> {

    List<Agreement> getAgreementsByOwnerId(Long ownerId);

    @Query("select a.ownerId from Agreement a where a.id=:agreementId")
    Optional<Long> findOwnerIdById(@Param("agreementId") Long agreementId);

}
