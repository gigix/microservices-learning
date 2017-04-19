package org.thoughtworkers.microservices.rest;

public class Order {
    private long id;

    public Order(long id) {

        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getBuyerName() {
        // TODO: should invoke account service here
        return "Jeff Xiong";
    }
}
