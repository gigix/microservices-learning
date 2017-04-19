package org.thoughtworkers.microservices.rest;

public class Account {
    private final long id;
    private final String fullName;

    public Account(long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public long getId() {
        return id;
    }
}
