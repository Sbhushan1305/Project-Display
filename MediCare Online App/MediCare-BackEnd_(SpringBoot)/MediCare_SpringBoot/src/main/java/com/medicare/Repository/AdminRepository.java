package com.medicare.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.entity.AdminEntity;
import java.util.List;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {
	Optional<AdminEntity> findByAdminEmailAndAdminPassword(String adminEmail, String adminPassword);

	AdminEntity findByAdminEmail(String adminEmail);
}