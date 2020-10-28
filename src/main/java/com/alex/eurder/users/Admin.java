package com.alex.eurder.users;

public class Admin extends Customer {

    public Admin(String firstName, String lastName, String emailadress, String street, Integer streetNumber, Integer postalcode, String city) {
        super(firstName, lastName, emailadress, street, streetNumber, postalcode, city, Usertype.ADMIN);
    }
}
