package com.java.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.model.Doctor;
import com.java.service.DoctorService;

@Controller
public class RegistrationController {

	@Autowired
	private DoctorService DoctorService;
	
	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("doctor", new Doctor());
		return "Registration";
	}
	
	@PostMapping("/home")
	public String createDoctor(@ModelAttribute("Doctor") Doctor empDto) {
		DoctorService.createOrUpdateDoctor(empDto);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfDoctor(Model model) {
		List<Doctor> DoctorList = DoctorService.getAllDoctor();
		model.addAttribute("doctorList", DoctorList);
		return "doctorList";
	}
	
	@PostMapping("/delete")
	public String deleteDoctor(@RequestParam("id") String id) {
		DoctorService.deleteDoctor(Integer.parseInt(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editDoctor(@RequestParam("id") String id, Map<String, Object> model) {
		Doctor empDTO = DoctorService.editDoctor(Integer.parseInt(id));
		model.put("doctor", empDTO);
		return "Registration";
	}
	
}
