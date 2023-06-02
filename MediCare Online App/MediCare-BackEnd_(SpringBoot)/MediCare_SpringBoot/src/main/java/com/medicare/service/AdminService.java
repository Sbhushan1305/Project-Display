package com.medicare.service;

import org.springframework.stereotype.Service;

import com.medicare.DTO.AdminDTO;

@Service
public interface AdminService {

	String addAdmin(AdminDTO adminDTO);

}
