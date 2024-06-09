package com.github.williamdlm.routes;

import com.github.williamdlm.service.GreetingServiceImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.apache.camel.builder.RouteBuilder;
@ApplicationScoped
public class CxfRoute extends RouteBuilder {

//    @Inject
//    GreetingServiceImpl greetingServiceImpl;

    @Override
    public void configure() throws Exception {
        from("cxf:bean:greetingEndpoint")
                .log("{$body}")
                .to("bean:greetingServiceImpl?method=sayHi")
        ;

    }
}
