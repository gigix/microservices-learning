package org.thoughtworkers.microservices.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Named
@Path("/")
public class AccountService {
    @GET
    @Path("account")
    @Produces(APPLICATION_JSON)
    public Account getAccount(@QueryParam("id") long id) {
        return new Account(id, "Jeff Xiong");
    }
}
