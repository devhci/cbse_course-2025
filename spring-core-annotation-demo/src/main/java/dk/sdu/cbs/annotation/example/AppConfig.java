package dk.sdu.cbs.annotation.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class that replaces XML configuration.
 * 
 * - @Configuration: Indicates that this class contains Spring bean definitions.
 * - @ComponentScan: Scans for components in the specified package.
 */
@Configuration
@ComponentScan(basePackages = "dk.sdu.cbs.annotation.example")
public class AppConfig {
}
