package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/saludo")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hola buenas, esto es una prueba de ci cd con github actions, " +
                "esto esta desglegado en kuberentes dentro de google cloud";
    }
}