package com.example.demo;

import com.example.demo.Model.Address;
import com.example.demo.Model.Customer;
import com.example.demo.Model.MyDate;
import com.example.demo.Model.Trip;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldCreateCustomer() throws Exception {
        Customer createdCustomer = createCustomer();
        assertNotNull(createdCustomer.getTrip());
        assertEquals(createdCustomer.getName(), "Jan");
        assertEquals(createdCustomer.getId(), 94072199999L);
    }

    private Customer createCustomer() throws Exception {
        Customer customer = getTestCustomer();
        String postValue = OBJECT_MAPPER.writeValueAsString(customer);
        MvcResult storyResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/postcustomers")
                .contentType(MediaType.APPLICATION_JSON)
                .content(postValue))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
        return OBJECT_MAPPER.readValue(storyResult.getResponse().getContentAsString(), Customer.class);
    }

    private Customer getTestCustomer() {
        Customer customer = new Customer();
        MyDate start = new MyDate(2020, 8, 10);
        MyDate end = new MyDate(2020, 8, 20);
        customer.setName("Jan");
        customer.setId(94072199999L);
        customer.setAddress(new Address("Piotrkowska 13", 92215, "Lodz"));
        customer.setTrip(new Trip(start, end, "Barcelona"));
        return customer;
    }
}
