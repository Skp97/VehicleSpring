package vehiclesloosecoupled;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bus implements Vehicle{

	public void capacity() {
		System.out.println("Bus Capacity is 100");
		
	}

}
