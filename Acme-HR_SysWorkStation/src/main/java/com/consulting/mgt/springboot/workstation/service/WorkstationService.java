package com.consulting.mgt.springboot.workstation.service;

import java.util.List;

import com.consulting.mgt.springboot.workstation.model.Workstation;

public interface WorkstationService {
	List<Workstation> findbyVendor(String vendor);

	Workstation findByEmployee(String employeeId);

	Workstation findBySerialNumber(String serialNumber);

	Workstation register(Workstation workstation);

}
