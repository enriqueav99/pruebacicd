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
        return "Hola buenas tardes, esto es una prueba de CI/CD con github actions con cache, " +
                "esto esta desglegado en kuberentes dentro de google cloud. El cd es actualizando el chart de helm.";
    }
}
