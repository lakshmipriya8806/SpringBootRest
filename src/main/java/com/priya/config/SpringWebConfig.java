/**
 * 
 */
package com.priya.config;

/**
 * @author Priya
 *
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringWebConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addRedirectViewController("/", "/dashboard");
        registry.addViewController("/dashboard").setViewName("dashboard");
        registry.addViewController("/login").setViewName("login");
    }

}