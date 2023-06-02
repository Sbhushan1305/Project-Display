package com.medicare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.medicare.DTO.AdminDTO;
import com.medicare.Repository.AdminRepository;
import com.medicare.entity.AdminEntity;
import com.medicare.service.AdminService;

public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	// saving admin records
	@Override
	public String addAdmin(AdminDTO adminDTO) {
		AdminEntity adminEntity = new AdminEntity(adminDTO.getAdminID(), adminDTO.getAdminName(),
				adminDTO.getAdminEmail(), this.passwordEncoder.encode(adminDTO.getAdminPassword()));
		adminRepository.save(adminEntity);
		return adminEntity.getAdminName();
	}
}
