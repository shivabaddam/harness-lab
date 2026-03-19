package com.harness.lab;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HelloController.class)
class HelloControllerWebMvcTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void rootEndpointReturnsWelcomeMessage() throws Exception {
		mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andExpect(content().string("Harness-lab: Hello from Harness CI/CD Kubernetes Lab!"));
	}

	@Test
	void healthEndpointReturnsHealthyMessage() throws Exception {
		mockMvc.perform(get("/health"))
			.andExpect(status().isOk())
			.andExpect(content().string("Application is healthy"));
	}
}
