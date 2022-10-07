package vehiclesloosecoupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Vehicle.xml");
		Travel travel=(Travel) applicationContext.getBean("travel");
		travel.passenger();
	}
}
