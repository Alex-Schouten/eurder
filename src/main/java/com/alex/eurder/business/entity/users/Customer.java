package com.alex.eurder.business.entity.users;

import java.util.Objects;
import java.util.UUID;

public class Customer {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String mailAddress;
    private final String street;
    private final Integer streetNumber;
    private final Integer postalCode;
    private final String city;

    public Customer(String firstName, String lastName, String mailAddress, String street, Integer streetNumber, Integer postalCode, String city) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
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

    public String getMailAddress(String mailAddress){
        return mailAddress;
    }

    public String getStreet(String street){
        return street;
    }

    public Integer getStreetNumber(Integer streetNumber){
        return streetNumber;
    }

    public Integer getPostalCode(Integer postalCode){
        return postalCode;
    }

    public String getCity(String city){
        return city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }
}


