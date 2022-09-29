package com.democmswb.repository;

import com.democmswb.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
}
