package com.machale.client.hs.model;

import java.io.Serializable;
import java.util.Objects;

public class UserKey implements Serializable {

    private static final long serialVersionUID = -76L;

    private final String id;

    public UserKey(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserKey userKey = (UserKey) o;
        return Objects.equals(id, userKey.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserKey{" +
                "id='" + id + '\'' +
                '}';
    }
}
