package com.danny.levievs.myspringwebkeynotes.service;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import com.danny.levievs.myspringwebkeynotes.repository.AgreementsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AgreementService {

    private final AgreementsRepository agreementsRepository;

    public List<Agreement> getAgreementsByOwnerId(Long ownerId){
        return agreementsRepository.getAgreementsByOwnerId(ownerId);
    }

    public Optional<Long> getAgreementOwnerByAgreementId(Long agreementId){
        return agreementsRepository.findOwnerIdById(agreementId);
    }
}
