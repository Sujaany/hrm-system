package com.sgic.hrm.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.ProfessionalQualificationDto;
import com.sgic.hrm.commons.entity.EmployeeProfessionalQualification;
import com.sgic.hrm.commons.entity.ProfessionalQualification;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.employee.service.EmployeeProfessionalQualificationService;
import com.sgic.hrm.employee.service.ProfessionalQualificationService;
import com.sgic.hrm.employee.service.UserService;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class EmployeeProfessionalQualificationController {


	@Autowired
	private EmployeeProfessionalQualificationService employeeProfessionalQualificationService;
	@Autowired
	private ProfessionalQualificationService professionalQualificationService;
	@Autowired
	private UserService userService;
	
	@PostMapping("/employeeProfessionalQualification")
	public HttpStatus addEmployeeProfessionalQualification(@Valid @RequestBody EmployeeProfessionalQualification employeeProfessionalQualification) {
		boolean test = employeeProfessionalQualificationService.addEmployeeProfessionalQualification(employeeProfessionalQualification);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@GetMapping("/employeeProfessionalQualification")
	public ResponseEntity<List<EmployeeProfessionalQualification>> GetEmployeeProfessionalQualification(){
		List<EmployeeProfessionalQualification> employeeProfessionalQualifications=employeeProfessionalQualificationService.getAllEmployeeProfessionalQualifications();
		ResponseEntity<List<EmployeeProfessionalQualification>> response=new ResponseEntity<>(employeeProfessionalQualifications,HttpStatus.OK);
		return response;
	}
	@PutMapping("/employeeProfessionalQualification/{id}")
	public HttpStatus ModifyEmployeeProfessionalQualification(@PathVariable Integer id,@RequestBody EmployeeProfessionalQualification employeeProfessionalQualification) {
		boolean editTest=employeeProfessionalQualificationService.editEmployeeProfessionalQualification(employeeProfessionalQualification, id);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/employeeProfessionalQualification/{id}")
	public HttpStatus DeleteEmployeeProfessionalQualification(@PathVariable Integer id) {
		boolean test=employeeProfessionalQualificationService.deleteEmployeeProfessionalQualification(id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/mockTemplate")
	public ProfessionalQualificationDto getTemplate() {
		ProfessionalQualificationDto obj=new ProfessionalQualificationDto();
		return obj;
	}
	
//	@PostMapping("/addTemplate")
//	public ProfessionalQualificationDto addTemplate() {
//		ProfessionalQualificationDto obj=new ProfessionalQualificationDto();
//		
//		
////		EmployeeProfessionalQualification empPrQaObj=new EmployeeProfessionalQualification();
////		User userObj=userService.getUserId(obj.getUserId());
////		empPrQaObj.setUserId(userObj);
//		
//		ProfessionalQualification prObj=new ProfessionalQualification();
//		
//		 employeeProfessionalQualificationService.addEmployeeProfessionalQualification(empPrQaObj);
//		professionalQualificationService.addProfessionalQualification(prObj);
//		return obj;
//	}
}
