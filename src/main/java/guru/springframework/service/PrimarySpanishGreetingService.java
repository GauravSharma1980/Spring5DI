package guru.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import  guru.springframework.service.GreetingService;
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting()
    {
        return "from SpanishGreetingService";
    }

}
