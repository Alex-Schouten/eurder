package users;

import java.util.Objects;
import java.util.UUID;

public abstract class Customer {
    private final String id;
    private final String firstName;
    private String lastName;
    private String emailadress;
    private String street;
    private Integer streetNumber;
    private Integer postalcode;
    private String city;

    public Customer(String firstName, String lastName, String emailadress, String street, Integer streetNumber, Integer postalcode, String city){
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailadress = emailadress;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalcode = postalcode;
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

    public String getEmailadress(String emailadress){
        return emailadress;
    }

    public String getStreet(String street){
        return street;
    }

    public Integer getStreetNumber(Integer streetNumber){
        return streetNumber;
    }

    public Integer getPostalcode(Integer postalcode){
        return streetNumber;
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
                ", emailadress='" + emailadress + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", postalcode=" + postalcode +
                ", city='" + city + '\'' +
                '}';
    }
}


