package pl.edu.pjwstk.NatBrz;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class QaService implements HandlerServiceInterface {

    @Override
    public String sendMessage() {
        return "Hello from Qa";
    }

    @Override
    public String getServiceType() {
        return "qa";
    }
}
