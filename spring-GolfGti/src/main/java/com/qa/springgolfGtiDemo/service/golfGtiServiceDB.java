package com.qa.springgolfGtiDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springgolfGtiDemo.domain.GolfGti;
import com.qa.springgolfGtiDemo.repo.GolfGtiRepo;

@Service
public class golfGtiServiceDB {

	
	private GolfGtiRepo repo;
	@Autowired
public golfGtiServiceDB(GolfGtiRepo repo) {
		this.repo = repo;
	}

public String createGolfGti(GolfGti c) {
this.repo.saveAndFlush(c);
return"Successfully added Golf from Repo!";
}
publicList<golf>getAllCars(){
	return this.repo.findAllCars();
}
public void removeCar (Long id) {
this.repo.deleteCar(id);
}
}