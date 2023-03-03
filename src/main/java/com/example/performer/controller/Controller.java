package com.example.performer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.performer.entity.Performer;
import com.example.performer.repo.PerformerRepo;

@RestController
public class Controller {
	@Autowired
	PerformerRepo perfomerRepo; 
//	Http post/get/dele/put

	
	@PostMapping("/add")
	 Performer addEmployee(@RequestBody Performer newPerformer) {
		System.out.println("add perfomer");
	    return perfomerRepo.save(newPerformer);
	  }
	

	@GetMapping("/getAll")
	List <Performer> getPerformer(){
		return perfomerRepo.findAll();
	}
	
	@DeleteMapping("/del/{id}")
	public void delPerformer(@PathVariable("id") int id) {
		perfomerRepo.deleteById(id);
	}
	
//	@PutMapping("/update/{id}")
//	public void updatePerformer(@PathVariable("id") int id ) {
//		Performer p = perfomerRepo.getById(id);
//		
//	}
//	


}
