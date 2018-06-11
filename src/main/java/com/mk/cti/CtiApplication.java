/*
 * This is the main source file for the project.
 * It includes running the application class.
 */
package com.mk.cti;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CtiApplication
{

    @Value("${tomcat.ajp.port}")
    private int ajpPort;

    /**
     * This is the main entry point for the CTI Application.
     * @param args sdfdsf
     */
    public static void main(String[] args)
    {

        /*
        This method runs the spring boot cti application.
         */
        SpringApplication.run(CtiApplication.class, args);

    }


    /**
     * This method returns the instance of a servlet container
     * @return sdfasd
     */
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> servletContainer()
    {
        return server -> server.addAdditionalTomcatConnectors(redirectConnector());
    }

    private Connector redirectConnector()
    {
        Connector connector = new Connector("AJP/1.3");
        connector.setScheme("http");
        connector.setPort(ajpPort);
        connector.setSecure(false);
        connector.setAllowTrace(false);
        return connector;
    }
}
