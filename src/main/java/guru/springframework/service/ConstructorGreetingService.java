package guru.springframework.service;

import guru.springframework.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting()
    {
        return "Hello - I  was injected  via  the costructor..";
    }

}
