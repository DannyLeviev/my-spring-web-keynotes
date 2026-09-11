package com.danny.levievs.myspringwebkeynotes.web;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import com.danny.levievs.myspringwebkeynotes.service.AgreementService;
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

    @GetMapping("owner/{id}")
        public ResponseEntity<List<Agreement>> getAgreementsByOwnerId(@PathVariable Long id){
            log.debug("Begining proccessing the getAgreementsByOwnerId for ownerId={}", id);
            return ResponseEntity.ok(agreementService.getAgreementsByOwnerId(id));
    }

}
