package com.alex.eurder.business.repository;

import com.alex.eurder.business.entity.users.Admin;
import com.alex.eurder.exceptions.users.AdminAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminRepository {
    private final Map<String, Admin> admins;

    public AdminRepository(){
        this.admins = new HashMap<>();
        addFirstAdmin();
    }

    public void addFirstAdmin(){
        Admin admin = new Admin("Liesbeth", "DeBruin");
        admins.put(admin.getId(), admin);
    }

    public Admin save(Admin admin){
        if(admins.containsValue(admin)) throw new AdminAlreadyExistsException (admin.getId() + " already exists");
        admins.put(admin.getId(), admin);
        return admin;
    }

//    public List<Admin> getAdmins(){
//        return new ArrayList<>(admins.values());
//    }

//    public Map<String, Admin> getAdminMap()
//    {
//        return admins;
//    }
}
