package com.example.placement.placementmanagement;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
	private PlacmentRepo repo;

	public List<placement> listAll() 
	 {
	 return (List<placement>) repo.findAll();
	 }
	 
	 public void save(placement place) 
	 {
	 repo.save(place);
	 }
	 
	 public placement get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	
	
}
