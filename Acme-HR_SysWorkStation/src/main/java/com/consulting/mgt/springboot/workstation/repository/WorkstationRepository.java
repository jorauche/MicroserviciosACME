package com.consulting.mgt.springboot.workstation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.consulting.mgt.springboot.workstation.model.Workstation;

public interface WorkstationRepository extends JpaRepository<Workstation, Long> {

	@Query("SELECT e FROM Workstation e WHERE e.vendor =:vendor")
	List<Workstation> findbyVendor(String vendor);
	
	@Query("SELECT e FROM Workstation e WHERE e.employee =:employee")
	Workstation findByEmployee(String employee);
	
	@Query("SELECT e FROM Workstation e WHERE e.serialNumber =:serialNumber")
	Workstation findBySerialNumber(String serialNumber);
}
