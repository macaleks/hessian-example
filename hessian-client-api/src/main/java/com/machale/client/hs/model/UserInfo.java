package com.machale.client.hs.model;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = -76L;

    private final String id;
    private final String name;

    public UserInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
