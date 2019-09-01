package guru.springframework.service;

import guru.springframework.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")

public class PrimaryGreetingService implements GreetingService {

    public String sayGreeting()
    {
        return "from PrimaryGreetingService...";
    }
}
