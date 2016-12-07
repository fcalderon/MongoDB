package com.calderon.database.mongdb.model;

/**
 * Created on 12/7/16.
 */
public class Publisher extends Address {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
