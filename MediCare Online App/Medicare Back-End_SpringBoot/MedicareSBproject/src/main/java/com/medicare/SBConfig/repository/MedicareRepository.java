package com.medicare.SBConfig.repository;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.SBConfig.model.MedicareProductEntity;
@Repository
public interface MedicareRepository extends JpaRepository<MedicareProductEntity, Integer>{

	public Optional<MedicareProductEntity> findByname(String mediname);
}
