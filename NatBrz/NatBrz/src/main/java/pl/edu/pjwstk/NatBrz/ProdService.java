package pl.edu.pjwstk.NatBrz;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProdService implements HandlerServiceInterface {

    @Override
    public String sendMessage() {
        return "Hello from Prod";
    }

    @Override
    public String getServiceType() {
        return "prod";
    }
}
