package com.novoda.demo.team;

public class TeamMember {
    private final String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
