package com.crossover.springboot.training.d01.s04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * A simple Spring configuration, which wires the beans automatically via {@link ComponentScan}ing
 *
 * @author bogdan.solga
 */
@Configuration
@ComponentScan(basePackages = "com.crossover.springboot.training.d01.s04")
public class ComponentScanConfig {
}
