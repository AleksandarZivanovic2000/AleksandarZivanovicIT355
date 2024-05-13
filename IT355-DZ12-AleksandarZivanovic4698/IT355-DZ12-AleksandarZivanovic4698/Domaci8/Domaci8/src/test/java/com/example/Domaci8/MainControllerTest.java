package com.example.Domaci8;

import controller.MainController;
import entity.Address;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import repository.AddressRepository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MainControllerTest {
    @Mock
    private AddressRepository addressRepository;

    @InjectMocks
    private MainController mainController;

    private MockMvc mockMvc;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
    }

    @Test
    public void testGetAllAddresses() throws Exception {
        List<Address> addresses = new ArrayList<>();
        // Dodajte adresu u listu

        when(addressRepository.findAll()).thenReturn(addresses);

        mockMvc.perform(get("/addresses")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}