package com.consulting.mgt.springboot.workstation.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consulting.mgt.springboot.workstation.model.Workstation;
import com.consulting.mgt.springboot.workstation.repository.WorkstationRepository;

@Service
@Transactional
public class WorkstationServiceImpl implements WorkstationService {

	@Autowired
	private WorkstationRepository workstationRepository;
	
	@Override
	public List<Workstation> findbyVendor(String vendor) {
		return workstationRepository.findbyVendor(vendor);
	}

	@Override
	public Workstation findByEmployee(String employeeId) {
//		Workstation wsk = workstationRepository.findByEmployee(employeeId);
		return workstationRepository.findByEmployee(employeeId);
	}

	@Override
	public Workstation findBySerialNumber(String serialNumber) {
		// TODO Auto-generated method stub
		return workstationRepository.findBySerialNumber(serialNumber);
	}

	@Override
	public Workstation register(Workstation workstation) {
		// TODO Auto-generated method stub
		return workstationRepository.save(workstation);
	}

}
