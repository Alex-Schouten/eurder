package com.alex.eurder.business.repository;

import com.alex.eurder.business.entity.users.Admin;

import javax.swing.undo.CannotUndoException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminRepository {
    private Map<String, Admin> admins;

    public void addFirstAdmin(){
        Admin admin = new Admin("Liesbeth", "DeBruin");
        admin.put(admin.getId(), admin);
    }

    public Admin save(Admin admin){
        if(admins.containsValue(admin)) throw new CannotUndoException(admin.getFirstName() + " " + admin.getLastName());
        admins.put(admin.getId(), admin);
    }

    public List<Admin> getAdmins(){
        return new ArrayList<>(admins.values());
    }

    public Map<String, Admin> getAdminMap()
    {
        return admins;
    }
}
