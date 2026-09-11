package com.danny.levievs.myspringwebkeynotes.web;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import com.danny.levievs.myspringwebkeynotes.model.CustomerAndAddressDto;
import com.danny.levievs.myspringwebkeynotes.service.AgreementService;
import com.danny.levievs.myspringwebkeynotes.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/agreements")
@CrossOrigin(origins = "*")
public class AgreementController {

    private final AgreementService agreementService;
    private final CustomerService customerService;

    @GetMapping("owner/{id}")
        public ResponseEntity<List<Agreement>> getAgreementsByOwnerId(@PathVariable Long id){
            log.debug("Beginning processing the getAgreementsByOwnerId for ownerId={}", id);
            return ResponseEntity.ok(agreementService.getAgreementsByOwnerId(id));
    }

    @GetMapping("/{agreementId}/customer")
    public ResponseEntity<CustomerAndAddressDto> getAgreementOwner(@PathVariable Long agreementId){
        log.debug("Beginning processing the getAgreementOwner for agreementId={}", agreementId);
        return ResponseEntity.ok(customerService.getAgreementOwner(agreementId));
    }

}
