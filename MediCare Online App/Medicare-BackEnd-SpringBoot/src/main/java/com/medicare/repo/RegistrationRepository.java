package com.medicare.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.medicare.model.RegistrationEntity;
import java.util.List;

@EnableJpaRepositories
@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer>{

	public Optional<RegistrationEntity> findByusername(String username);

	public Optional<RegistrationEntity> findByUseremailAndUserpassword(String username, String userpassword);

	public RegistrationEntity findByuseremail(String useremail);

}