package org.example3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example3.proxies", "org.example3.repositories", "org.example3.services"})
public class ProjectConfiguration {
}
