package dk.sdu.cbs.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "dk.sdu.cbs.demo")

@EnableAspectJAutoProxy
public class AppConfig {
}
