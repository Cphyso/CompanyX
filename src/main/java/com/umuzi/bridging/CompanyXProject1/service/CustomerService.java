package com.umuzi.bridging.CompanyXProject1.service;

import com.umuzi.bridging.CompanyXProject1.dao.CustomerDAOImpl;
import com.umuzi.bridging.CompanyXProject1.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CustomerService {


    @Autowired
    private CustomerDAOImpl customerDAO;

    public List<Customer> getAllCustomers(){
        return customerDAO.getAllCustomer();
    }

    public void addCustomer(Customer customer){
        customerDAO.insertNewCustomer(customer);
    }

    public Customer getCustomerById(long customerID) {
        return customerDAO.getCustomerByID(customerID);
    }

    public void updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }

    public void deleteCustomer(long customerID) {
        customerDAO.deleteCustomer(customerID);
    }
}


