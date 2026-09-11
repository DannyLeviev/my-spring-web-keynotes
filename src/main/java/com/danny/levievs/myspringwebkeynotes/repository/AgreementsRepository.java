package com.danny.levievs.myspringwebkeynotes.repository;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementsRepository extends JpaRepository<Agreement, Long> {
}
