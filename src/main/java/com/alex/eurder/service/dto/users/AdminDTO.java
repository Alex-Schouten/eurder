package com.alex.eurder.service.dto.users;

import com.alex.eurder.business.entity.users.Usertype;

public class AdminDTO {
    private Usertype usertype;

    public Usertype usertype(){
        return usertype;
    }

    public void setUsertype(Usertype usertype){
        this.usertype = usertype;
    }
}
