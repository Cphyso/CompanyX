package com.umuzi.bridging.CompanyXProject1.controller;

import com.umuzi.bridging.CompanyXProject1.model.Customer;
import com.umuzi.bridging.CompanyXProject1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/allCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @RequestMapping(method = RequestMethod.POST, value="/customers")
    public void addCustomer(@RequestBody Customer customer){
         customerService.addCustomer(customer);
    }
    @RequestMapping("/customers/{customerID}")
    public Customer getCustomerByID(@PathVariable long customerID){
        return customerService.getCustomerById(customerID);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/customers/{customer}")
    public void updateCustomer(@RequestBody  Customer customer){
        customerService.updateCustomer(customer);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/customers/{customerID}")
    public void deleteCustomer(@PathVariable long customerID){
        customerService.deleteCustomer(customerID);
    }
}
