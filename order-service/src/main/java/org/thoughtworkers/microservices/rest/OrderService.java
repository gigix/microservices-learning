package org.thoughtworkers.microservices.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Named
@Path("/")
public class OrderService {
    @GET
    @Path("order")
    @Produces(APPLICATION_JSON)
    public Order getOrder(@QueryParam("id") long id) {
        return new Order(id);
    }
}
