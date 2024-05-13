package com.example.Domaci8;

import controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@ActiveProfiles("test")
class ApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGetAllAddresses() throws Exception {
		mockMvc.perform(get("/api/addresses"))
				.andExpect(status().isOk());
	}

	@Test
	void testGetAllCountries() throws Exception {
		mockMvc.perform(get("/api/countries"))
				.andExpect(status().isOk());
	}

	@Test
	void testGetAllCustomers() throws Exception {
		mockMvc.perform(get("/api/customers"))
				.andExpect(status().isOk());
	}
}
