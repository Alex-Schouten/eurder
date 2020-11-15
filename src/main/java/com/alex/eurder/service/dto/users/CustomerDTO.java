package com.alex.eurder.service.dto.users;

import java.util.Objects;

public class CustomerDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String emailadress;
    private String street;
    private Integer streetNumber;
    private Integer postalcode;
    private String city;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmailadress(){
        return emailadress;
    }

    public void setEmailadress(String emailadress){
        this.emailadress = emailadress;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public Integer getStreetNumber(){
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber){
        this.streetNumber = streetNumber;
    }

    public Integer getPostalcode(){
        return postalcode;
    }

    public void setPostalcode(Integer postalcode){
        this.postalcode = postalcode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

