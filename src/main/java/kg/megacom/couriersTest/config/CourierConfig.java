package kg.megacom.couriersTest.config;

import kg.megacom.couriersTest.models.Couriers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CourierConfig {
    @Bean
    public List<Couriers> getCouriers(){
        return new ArrayList<>();
    }
}