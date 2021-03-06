package com.alex.eurder.service;

import com.alex.eurder.business.entity.users.Admin;
import com.alex.eurder.business.repository.AdminRepository;
import com.alex.eurder.service.dto.users.AdminDTO;
import com.alex.eurder.service.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;
    private final AdminMapper adminMapper;

    @Autowired
    public AdminService(AdminRepository adminRepository, AdminMapper adminMapper) {
        this.adminRepository = adminRepository;
        this.adminMapper = adminMapper;
    }

    public AdminDTO save(AdminDTO adminDTO){
        Admin admin = adminRepository.save(adminMapper.toEntity(adminDTO));

        return adminMapper.toDTO(admin);
    }

}
