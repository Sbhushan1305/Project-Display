package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.Entity.ShoeEntity;
import com.example.demo.Repository.ShoeRepo;

@Service
public class ShoeService {
	@Autowired
	private ShoeRepo shoeRepo;

	public void addShoe(ShoeEntity shoeEntity) {
		shoeRepo.save(shoeEntity);
	}

	public List<ShoeEntity> getallShoes() {
		return shoeRepo.findAll();
	}
	
	public ShoeEntity getShoeDetailByID(int srno) {
		Optional<ShoeEntity> optionalshoeEntity=shoeRepo.findById(srno);
		if(optionalshoeEntity.isPresent()) {
			return optionalshoeEntity.get();
		}
		return null;
	}
	
	public void deleteShoeByID(int srno) {
		shoeRepo.deleteById(srno);
	}
}
