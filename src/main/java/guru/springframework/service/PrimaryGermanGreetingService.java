package guru.springframework.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import guru.springframework.service.GreetingService;
@Service
@Profile("de")
public class PrimaryGermanGreetingService  implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Say Hello in German";
    }
}
