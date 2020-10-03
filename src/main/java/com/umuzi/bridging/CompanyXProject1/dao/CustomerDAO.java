package com.umuzi.bridging.CompanyXProject1.dao;

import com.umuzi.bridging.CompanyXProject1.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
