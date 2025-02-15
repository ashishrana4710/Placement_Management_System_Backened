package com.example.placement.placementmanagement;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlacementController {

	@Autowired
	private PlacementService service;
	
	@GetMapping("/placements")
	private List<placement> list(){
		return service.listAll();
	}
	public ResponseEntity<placement> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 placement Place = service.get(id);
	 return new ResponseEntity<placement>(Place, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<placement>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/placements")
	 public void add(@RequestBody placement Place) 
	 {
	 service.save(Place);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/placements/{id}")
	 public ResponseEntity<?> update(@RequestBody placement Place, @PathVariable Integer id) 
	 {
	 try
	 {
	 service.save(Place);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/placements/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
}
