package com.example.placement.placementmanagement;

import org.springframework.data.repository.CrudRepository;

public interface IPlacementService extends CrudRepository<placement, Integer>{
	
	public placement addStudent(placement place);
	public placement updateStudent(placement place);
	public placement searchStudentById(long id);
//	public placement searchStudentByHallTicket(long ticketNo);
	public boolean deleteStudent(long id);



}
