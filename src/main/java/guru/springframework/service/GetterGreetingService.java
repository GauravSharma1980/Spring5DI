package guru.springframework.service;

import guru.springframework.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "Hello i was injected by a getter";
    }
}
