package com.example.demo.Repository;
import com.example.demo.Model.Customer;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TravelOffice {

    public Map<Long, Customer> mapCustomer = new HashMap<>();

    public long getCustomerCount() {
        return mapCustomer.size();
    }

    public Map<Long, Customer> getAllCustomers() {
        return mapCustomer;
    }

    public void addCustomer(Customer customer) {
        mapCustomer.put(customer.getId(), customer);
    }
}
