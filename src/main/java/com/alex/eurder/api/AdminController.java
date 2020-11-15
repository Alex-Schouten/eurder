package com.alex.eurder.api;

import com.alex.eurder.service.AdminService;
import com.alex.eurder.service.dto.users.AdminDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(path = "/admins")
    public class AdminController {

        private final AdminService adminService;

        @Autowired
        public AdminController(AdminService adminService) {
            this.adminService = adminService;
        }

        @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        @ResponseStatus(HttpStatus.CREATED)
        public AdminDTO save(@RequestBody AdminDTO adminDTO) {
            return adminService.save(adminDTO);
        }
}
