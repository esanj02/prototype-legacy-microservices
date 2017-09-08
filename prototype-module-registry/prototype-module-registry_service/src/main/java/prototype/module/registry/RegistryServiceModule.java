package prototype.module.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 
 * @author Marcin Grzejszczak
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryServiceModule {
    
    public static void main(String[] args) {
        SpringApplication.run(RegistryServiceModule.class, args);
    }
}
