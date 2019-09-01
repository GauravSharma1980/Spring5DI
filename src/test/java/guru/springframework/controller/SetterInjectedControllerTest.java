package guru.springframework.controller;

import guru.springframework.service.GreetingService;
import guru.springframework.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp()
    {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }


    @Test
    public void testGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,setterInjectedController.sayHello() );
    }

}
