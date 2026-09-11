package com.danny.levievs.myspringwebkeynotes.service;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import com.danny.levievs.myspringwebkeynotes.repository.AgreementsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AgreementService {

    private final AgreementsRepository agreementsRepository;

    public Agreement getAgreementById(Long id){
        return agreementsRepository.findById(id).orElse(null);
    }
}
