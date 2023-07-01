package com.MymoviePlan.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.MymoviePlan.model.MymovieEntity;
@EnableJpaRepositories
@Repository
public interface MovieRepository extends JpaRepository<MymovieEntity, Integer> {
	public Optional<MymovieEntity> findByMovieName(String moviename);
}
