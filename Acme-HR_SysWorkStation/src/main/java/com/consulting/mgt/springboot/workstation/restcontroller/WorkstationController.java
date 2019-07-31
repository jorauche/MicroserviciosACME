package com.consulting.mgt.springboot.workstation.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulting.mgt.springboot.workstation.model.Workstation;
import com.consulting.mgt.springboot.workstation.service.WorkstationService;

import lombok.Setter;

@RestController
@RequestMapping("/workstations")
public class WorkstationController {
	
	@Autowired	private @Setter WorkstationService workstationService;
	
	@GetMapping("/findSerial")
	private Workstation getSerialNumber(String serialNumber) {
		return workstationService.findBySerialNumber(serialNumber);
	}
	
	
	
	@PostMapping("/register/workstation")
	private void register(@RequestBody Workstation workstation) {
		workstationService.register(workstation);
	}

}
