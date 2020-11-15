package com.alex.eurder.service.mapper;

import com.alex.eurder.business.entity.users.Admin;
import com.alex.eurder.service.dto.users.AdminDTO;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {
    public Admin toEntity(AdminDTO adminDTO) {
        Admin result = new Admin(
                adminDTO.getFirstName(),
                adminDTO.getLastName()
        );

        return result;
    }

    public AdminDTO toDTO(Admin admin) {
        AdminDTO result = new AdminDTO();
        result.setId(admin.getId());
        result.setFirstName(admin.getFirstname());
        result.setLastName(admin.getLastname());
        return result;
    }
}