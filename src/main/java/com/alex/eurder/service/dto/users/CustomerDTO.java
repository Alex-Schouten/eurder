package com.alex.eurder.service.dto.users;

public class CustomerDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String mailAddress;
    private String street;
    private Integer streetNumber;
    private Integer postalCode;
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

    public String getMailAddress(){
        return mailAddress;
    }

    public void setMailAddress(String mailAddress){
        this.mailAddress = mailAddress;
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

    public Integer getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(Integer postalCode){
        this.postalCode = postalCode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

}

