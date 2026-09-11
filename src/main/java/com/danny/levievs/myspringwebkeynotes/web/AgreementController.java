package com.danny.levievs.myspringwebkeynotes.web;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import com.danny.levievs.myspringwebkeynotes.service.AgreementService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/agreements")
@CrossOrigin(origins = "*")
public class AgreementController {

    private final AgreementService agreementService;

    @GetMapping("/{id}")
        public ResponseEntity<Agreement> getAgreementById(@PathVariable Long id){
            return ResponseEntity.ok(agreementService.getAgreementById(id));
    }

}
