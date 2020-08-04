package com.java.service;

import java.util.List;

import com.java.model.Doctor;

public interface DoctorService {

	public void createOrUpdateDoctor(Doctor doc);
	
	public List<Doctor> getAllDoctor();
	
	public void deleteDoctor(int id);
	
	public Doctor editDoctor(int id);
	
}
