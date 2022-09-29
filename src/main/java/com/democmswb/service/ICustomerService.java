package com.democmswb.service;

import com.democmswb.Customer;
import com.democmswb.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer>findAll (Pageable pageable);
    Page<Customer>findAllByFirstNameContaining(String firstName, Pageable pageable);
}
