package com.medicare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.DTO.AdminDTO;
import com.medicare.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("medicare/v1/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping(path= "/saveAdmin")
	public String saveAdmin(@RequestBody AdminDTO adminDTO) {
		String id=adminService.addAdmin(adminDTO);
		return id;
	}
}
