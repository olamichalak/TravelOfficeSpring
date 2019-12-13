package com.example.demo.Controller;

import com.example.demo.Model.*;
import com.example.demo.Repository.TravelOffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Test {

    @Autowired
    TravelOffice office;

    @PostMapping("/postcustomers")
    public Customer addCustomer(@RequestBody Customer customer) {
        office.addCustomer(customer);
        return customer;
    }

    @GetMapping("/customers")
    public Map<Long, Customer> getCustomers() {
        return office.getAllCustomers();
    }

    @GetMapping("get-customer-count")
    public long getCustomerCount() {
        return office.getCustomerCount();
    }
}

