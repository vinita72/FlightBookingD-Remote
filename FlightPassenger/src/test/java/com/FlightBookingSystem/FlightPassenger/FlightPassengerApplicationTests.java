package com.FlightBookingSystem.FlightPassenger;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.FlightBookingSystem.FlightPassenger.model.Passenger;
import com.FlightBookingSystem.FlightPassenger.repository.PassengerRepo;
import com.FlightBookingSystem.FlightPassenger.service.PassengerService;

import ch.qos.logback.core.Context;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class FlightPassengerApplicationTests {

	// private static final String FAKE_STRING = "Login was successful";

	
	  @Mock 
	  Context mMockContext;
	  
	  
	  
		@Autowired
		  private PassengerService service;  

		@MockBean
		 private PassengerRepo repository;
		
		@Test
		public void savePassengerTest() {
			Passenger passenger = new Passenger(3, "Danile", "Smith", "danile12", "danile12@gmail.com", 789233121, 834039, "Block-1");
			when(repository.save(passenger)).thenReturn(passenger);
			assertEquals(passenger, service.savePassenger(passenger));
		}
}
		
			
			/*
			 * @Test public void getPassengersTest() {
			 * when(repository.findAll()).thenReturn(Stream .of( new Passenger(3, "Danile",
			 * "Smith", "danile12", "danile12@gmail.com", 789233121, 834039, "Block-1"), new
			 * Passenger(4, "Ross", "Smith", "ross12", "ross@gmail.com", 456456563, 54345,
			 * "Block-a")) .collect(Collectors.toList())); assertEquals(2,
			 * service.getPassenger().size()); }
			 */
			 

			/*
			 * @Test public void getPassengerByEmailIdTest() { String id = "3";
			 * when(repository.findByEmailId(id)) .thenReturn((new Passenger(3, "Danile",
			 * "Smith", "danile12", "danile12@gmail.com", 789233121,834039,"Block-1"))
			 * .collect(Collectors.toList())); assertEquals(1, service.getPassengerById(3));
			 * }
			 */

		
		
		/*
		 * @Test public void getPassengerTest() { String emailId = "danile12@gmail.com";
		 * when(repository.findByEmailId(emailId)).thenReturn((new Passenger(3,
		 * "Danile", "Smith", "danile12", "danile12@gmail.com",
		 * 789233121,834039,"Block-1", null)) .collect(Collectors.toList())););
		 * assertEquals(1, service.fetchPassengerByEmailId(emailId).size());
		 * 
		 * }
		 */
		  
		/*
		 * @Test public void deleteUserTest() { Passenger passenger = new Passenger(3,
		 * "Danile", "Smith", "danile12", "danile12@gmail.com", 789233121, 834039,
		 * "Block-1", null); int id =3; controller.deletePassenger(id );
		 * verify(repository, times(3)).delete(passenger); }
		 * 
		 * 
		 * 
		 * }
		 */
  

/*  Passenger myObjectUnderTest = new Passenger();

// ...when the string is returned from the object under test...
String result = myObjectUnderTest.validate("user","user");

// ...then the result should be the expected one.
assertThat(result, is(FAKE_STRING));
}

private Object is(String fakeString) {
// TODO Auto-generated method stub
return null;
}
*/
