package vehiclesloosecoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Travel {
	@Autowired
	Vehicle vehicle;
	public void passenger() {
		vehicle.capacity();
	}
}
