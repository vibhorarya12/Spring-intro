package net.engineeringdigest.journalApp.entries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employees {

    @JsonProperty("name")  // Ensures the JSON field is "name"
    private String name;

    @JsonProperty("id")  // Ensures the JSON field is "id"
    private String id;

    // Constructors, getters, and setters

    public Employees() {}

    public Employees(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
