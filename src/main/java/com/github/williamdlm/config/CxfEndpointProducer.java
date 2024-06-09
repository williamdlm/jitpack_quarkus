package com.github.williamdlm.config;

import com.github.williamdlm.service.GreetingService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
@ApplicationScoped
public class CxfEndpointProducer {
    @Produces
    @Named("greetingEndpoint")
    public CxfEndpoint configure(){
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("/greeting");
        cxfEndpoint.setServiceClass(GreetingService.class);
        return cxfEndpoint;
    }
}
