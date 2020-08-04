package com.java.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.model.Doctor;
import com.java.service.DoctorService;
import com.java.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;

	public void createOrUpdateDoctor(Doctor doc) {
		doctorRepository.save(doc);
	}

	public List<Doctor> getAllDoctor() {
		List<Doctor> list = doctorRepository.findAll();
		return list;
	}
	
	public void deleteDoctor(int id) {
		doctorRepository.deleteById((long) id);
	}
	
	public Doctor editDoctor(int id) {
		Doctor emp = doctorRepository.getOne((long) id);
		return emp;
	}
	
//	private Doctor convertDtoToModel(DoctorDTO empDto) {
//		Doctor emp = new Doctor();
//		if (empDto.getId() != null) {
//			emp.setId(empDto.getId());
//		}
//		emp.setAge(empDto.getAge());
//		emp.setBloodGp(empDto.getBloodGp());
//		emp.setEmailId(empDto.getEmailId());
//		emp.setEmpId(empDto.getEmpId());
//		emp.setFirstName(empDto.getFirstName());
//		emp.setLastName(empDto.getLastName());
//		emp.setMobileNo(empDto.getMobileNo());
//		emp.setPersonalEmail(empDto.getPersonalEmail());
//		emp.setUserName(empDto.getUserName());
//		return emp;
//	}
	
//	private DoctorDTO convertModelToDTO(Doctor emp) {
//		DoctorDTO empDTO = new DoctorDTO();
//		empDTO.setId(emp.getId());
//		empDTO.setAge(emp.getAge());
//		empDTO.setBloodGp(emp.getBloodGp());
//		empDTO.setEmailId(emp.getEmailId());
//		empDTO.setEmpId(emp.getEmpId());
//		empDTO.setFirstName(emp.getFirstName());
//		empDTO.setLastName(emp.getLastName());
//		empDTO.setMobileNo(emp.getMobileNo());
//		empDTO.setPersonalEmail(emp.getPersonalEmail());
//		empDTO.setUserName(emp.getUserName());
//		return empDTO;
//	}
}
