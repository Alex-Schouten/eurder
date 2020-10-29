package com.alex.eurder.service.dto.users;

import com.alex.eurder.business.entity.users.Usertype;

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
    private Usertype usertype;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public String getEmailadress(){
        return emailadress;
    }

    public void setEmailadress(){
        this.emailadress = emailadress;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(){
        this.street = street;
    }

    public Integer getStreetNumber(){
        return streetNumber;
    }

    public void setStreetNumber(){
        this.streetNumber = streetNumber;
    }

    public Integer getPostalcode(){
        return postalcode;
    }

    public void setPostalcode(){
        this.postalcode = postalcode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(){
        this.city = city;
    }

    public Usertype usertype(){
        return usertype;
    }

    public void setUsertype(Usertype usertype){
        this.usertype = usertype;
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

