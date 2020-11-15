package com.alex.eurder.business.entity.users;

import java.util.Objects;
import java.util.UUID;

public class Admin {
    private final String id;
    private final String firstName;
    private final String lastName;


    public Admin(String firstName, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getId(){
        return id;
    }

    public String getFirstName(String firstName){
        return firstName;
    }

    public String getLastName(String lastName){
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
