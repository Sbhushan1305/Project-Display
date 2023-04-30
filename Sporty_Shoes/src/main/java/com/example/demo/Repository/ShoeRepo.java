package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ShoeEntity;
@Repository
public interface ShoeRepo extends JpaRepository<ShoeEntity, Integer> {

}
