package io.quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class ExampleResource {

    @Inject
    @RestClient
    GreetingClient client;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/mp")
    public String helloMp() {
        GreetingDeserialized greeting = client.greeting();
        return "hello " + greeting.name;
    }

    @ConfigProperty(name = "base-url")
    String baseUrl;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/jaxrs")
    public String helloJaxrs() {
        GreetingDeserialized greeting =
                ClientBuilder.newClient().target(baseUrl + "/greeting").request().get(GreetingDeserialized.class);
        return "hello " + greeting.name;
    }

}