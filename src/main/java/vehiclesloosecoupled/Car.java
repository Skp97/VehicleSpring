package vehiclesloosecoupled;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public void capacity() {
		System.out.println("Car Capacity is 5");
		
	}
	
}
