package com.danny.levievs.myspringwebkeynotes.model;

import com.danny.levievs.myspringwebkeynotes.domain.Agreement;
import java.util.List;


public record CustomerAndAddressDto(CustomerDto customer, List<Agreement> agreement) {

}
