package guru.springframework.controller;

import guru.springframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class SetterInjectedController {


	private GreetingService greetingServices;
	
	public String sayHello()
	{
		return greetingServices.sayGreeting();
	}

	@Autowired
	public void setGreetingService(GreetingService greetingServices)
	{
		this.greetingServices = greetingServices;
	}
}
