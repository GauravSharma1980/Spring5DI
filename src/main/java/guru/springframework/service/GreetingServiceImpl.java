package guru.springframework.service;

import guru.springframework.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	public static String  HELLO_GURUS = "Hello Guru's";
	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}

}
