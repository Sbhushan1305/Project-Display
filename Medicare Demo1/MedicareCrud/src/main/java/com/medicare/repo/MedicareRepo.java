package com.medicare.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.model.MedicareEntity;
@Repository
public interface MedicareRepo extends JpaRepository<MedicareEntity, Integer>{
	//optional is using because maybe data available or not to avoid null pointer exception
	public Optional<MedicareEntity> findByproductName(String productName);

}
