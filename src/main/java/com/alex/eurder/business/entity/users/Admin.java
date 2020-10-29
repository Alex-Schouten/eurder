package com.alex.eurder.business.entity.users;

public class Admin {
    private Usertype usertype;

    public Admin(Usertype usertype){
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "usertype=" + usertype +
                '}';
    }
}
