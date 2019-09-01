package guru.springframework.controller;

import static org.junit.Assert.assertEquals;

import guru.springframework.service.GreetingServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class PropertyInjectedControllerTest {


	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp()
	{
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
		
	}
	
	@Test
	public void testGreeting()
	{
		assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello() );

	}
	
	
	@After
	public void finalMethod()
	{
		System.out.println("after everything.......");
	}
}
