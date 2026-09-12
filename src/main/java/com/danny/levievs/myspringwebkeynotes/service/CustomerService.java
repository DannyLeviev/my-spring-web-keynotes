package com.danny.levievs.myspringwebkeynotes.service;

import com.danny.levievs.myspringwebkeynotes.exceptions.ResourceNotFoundException;
import com.danny.levievs.myspringwebkeynotes.model.CustomerAndAddressDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;



@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final AgreementService agreementService;
    private final RestClient castomersRestClient;


    public CustomerAndAddressDto getAgreementOwner(Long agreementId) {
        Long customerId = agreementService.getAgreementOwnerByAgreementId(agreementId)
                .orElseThrow(() -> new ResourceNotFoundException("No agreements found with id = " + agreementId));
        return getCustomerById(customerId);
    }


    private CustomerAndAddressDto getCustomerById(Long customerId) {

      log.debug("Calling Customers MS, /customers/{} API", customerId);
      long startTime = System.currentTimeMillis();

      try {
          return castomersRestClient.get()
                  .uri("/" + customerId)
                  .retrieve()
                  .onStatus(HttpStatusCode::is4xxClientError, (_, _) -> {
                      throw new IllegalArgumentException("No customer found for id = " + customerId);
                  })
                  .body(CustomerAndAddressDto.class);
      } finally{
          log.info("Elapsed Time: {}", (System.currentTimeMillis() - startTime) / 100 + "sec.");
      }
    }
}
