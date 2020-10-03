package com.umuzi.bridging.CompanyXProject1.dao;

import com.umuzi.bridging.CompanyXProject1.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CustomerDAOImpl {
    
    @Autowired
    private CustomerDAO customerDAO;
    
    public void insertNewCustomer(Customer customer){
        customerDAO.save(customer);
    }

    public List<Customer> getAllCustomer(){
        List<Customer> customerList = new ArrayList<>();
        customerDAO.findAll().forEach(customerList::add);
        return customerList;
    }

    public Customer getCustomerByID(long customerID) {
        Optional<Customer> customer = customerDAO.findById(customerID);
        Customer found = null;
        if(customer.isPresent()){
            found = customer.get();
        }
        return found;
    }

    public void updateCustomer(Customer customer) {
            customerDAO.save(customer);
    }

    public void deleteCustomer(long customerID) {
        customerDAO.deleteById(customerID);
    }
}
