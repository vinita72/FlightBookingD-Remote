package com.FlightBookingSystem.FlightDetails;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.core.Context;

@SpringBootTest
class FlightDetailsApplicationTests {

   
	
	@Test
	void readStringFromContext_LocalizedString() {
	}
}


/*
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest(value = UserController.class, secure = false) public class
 * UserControllerTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @MockBean private UserRepository userRepository;
 * 
 * User mockUser = new User("test", "test");
 * 
 * String exampleUserJson = "{\"username\":\"toto\",\"password\":\"toto\"}";
 * 
 * 
 * @Test public void loginTest() throws Exception {
 * 
 * 
 * User mockUser = new User("test", "test");
 * 
 * Mockito.when( userRepository.findByUsernameAndPassword(Mockito.anyString(),
 * Mockito.anyString())).thenReturn(mockUser);
 * 
 * // Send course as body to /students/Student1/courses RequestBuilder
 * requestBuilder = MockMvcRequestBuilders .post("/user/login")
 * .accept(MediaType.APPLICATION_JSON).content(exampleUserJson)
 * .contentType(MediaType.APPLICATION_JSON);
 * 
 * MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 * 
 * MockHttpServletResponse response = result.getResponse();
 * 
 * assertEquals(HttpStatus.INTERNAL_SERVER_ERROR.value(), response.getStatus());
 * 
 * assertEquals("http://localhost/user/login",
 * response.getHeader(HttpHeaders.LOCATION));
 * 
 * }
 */