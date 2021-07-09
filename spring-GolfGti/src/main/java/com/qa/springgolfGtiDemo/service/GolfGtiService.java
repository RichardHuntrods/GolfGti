package com.qa.springgolfGtiDemo.service;

import org.springframework.stereotype.Service;

import com.qa.springgolfGtiDemo.domain.GolfGti;
import com.qa.springgolfGtiDemo.repo.GolfGtiRepo;

@Service
public class GolfGtiService {

	private GolfGtiRepo repo;

	public GolfGtiService(GolfGtiRepo repo) {
		this.repo = repo;
	}

	public GolfGti create(GolfGti golf) {
		return this.repo.saveAndFlush(golf);
	}

public List<GolfGti> read(){
	return this.repo.findAll();
}

public GolfGti update(Long id GolfGti newgolf) {
GolfGti existing = this.repo.getById(id);
existing.setName(newGolf.getName());
existing.setYearIntroduced(newGolf.getYearIntroduced());
existing.setEngine(newGolf.getEngine());
existing.setValves(newGolf.getValves());
existing.setPower(newGolf.getPower());

GolfGti updated = this.repo.save(existing);
return updated;
}

public boolean delete(Long id) {
	this.repo.deleteById(id);
	return this.repo.existsById(id);
}

}