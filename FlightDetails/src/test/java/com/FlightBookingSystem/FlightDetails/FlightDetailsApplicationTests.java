package com.FlightBookingSystem.FlightDetails;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;


import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.FlightBookingSystem.FlightDetails.model.FlightDetails;
import com.FlightBookingSystem.FlightDetails.repository.FlightRepo;
import com.FlightBookingSystem.FlightDetails.service.FlightService;

import ch.qos.logback.core.Context;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class FlightDetailsApplicationTests {

   
	  @Mock 
	  Context mMockContext;
	  
	  
	  
		@Autowired
		  private FlightService service;  

		@MockBean
		 private FlightRepo repository;
		
		@Test
		public void savePassengerTest() {
			FlightDetails flightDetails = new FlightDetails(3, "Pune", "Delhi", 30, 2000, "19-July-2021");
			when(repository.save(flightDetails)).thenReturn(flightDetails);
			assertEquals(flightDetails, service.saveflightDetails(flightDetails));
		}
		
		
		

		/*
		 * @SuppressWarnings("unchecked")
		 * 
		 * @Test public void getUserByDateAndFromlocationAndTolocationTest() { String
		 * date = "19-July-2021"; String fromlocation ="Pune"; String
		 * tolocation="Delhi";
		 * when(repository.findByDateAndFromlocationAndTolocation(date, fromlocation,
		 * tolocation)) .thenReturn((FlightDetails) Stream.of(new FlightDetails(3,
		 * "Pune", "Delhi", 30, 2000, "19-July-2021")) .collect(Collectors.toList()));
		 * assertEquals(1, ((List<FlightDetails>)
		 * service.fetchFlightDetailsByDateAndFromlocationAndTolocation(date,
		 * fromlocation, tolocation)).size()); }
		 */
	
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