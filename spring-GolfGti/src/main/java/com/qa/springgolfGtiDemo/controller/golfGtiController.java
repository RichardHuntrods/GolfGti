package com.qa.springgolfGtiDemo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springgolfGtiDemo.domain.GolfGti;
import com.qa.springgolfGtiDemo.service.GolfGtiService;
@RestController
@RequestMapping("/GolfGti")
public class golfGtiController {

	private golfGtiServiceDB service;

	@Autowired
	public golfGtiController(golfGtiServiceDB service) {
		this.service = service;
	}

	@GetMapping("/test")
	public String test() {
		return "This is just a test";
	}

	@PostMapping("/create")
	public ResponseEntity<GolfGti> create(@RequestBody GolfGti golf) {
		return new ResponseEntity<GolfGti>(this.service.create(golf), HttpStatus.CREATED);
	}

@GetMapping("/read")
public ResponseEntity<GolfGti> read(){
return new ResponseEntity<GolfGti>>( this.service.read(), HttpStatus.OK); 
}

	//@PutMapping("/replace/{id}")
	//public ResponseEntity<GolfGti> update(@PathVariable Long id, @RequestBody GolfGti golf) {
		//return new ResponseEntity<GolfGti>(this.service.update(id, golf), HttpStatus.ACCEPTED);
	//}

	//@PatchMapping("/update/{id}")
	//public ResponseEntity<GolfGti> update2(@PathVariable Long id, @RequestBody GolfGti golf) {
		//return new ResponseEntity<GolfGti>(this.service.update(id, golf), HttpStatus.ACCEPTED);
	//}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Boolean> remove(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
	}

}