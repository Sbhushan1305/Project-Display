package com.medicare.SBConfig.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.SBConfig.model.MedicareProductEntity;
import com.medicare.SBConfig.repository.MedicareRepository;

@Service
public class MedicareService {
	@Autowired
	public MedicareRepository medicareRepository;
	
	//to see all Medical data
	public List<MedicareProductEntity> showList(){
		
		return (List<MedicareProductEntity>)medicareRepository.findAll();		
	}
	
//	public List<MedicareProductEntity> findByName(String mediname){
//		
//		
//		
//		return null;
//		
//	}

}
