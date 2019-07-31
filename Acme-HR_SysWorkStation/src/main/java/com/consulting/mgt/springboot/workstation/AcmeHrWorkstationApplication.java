package com.consulting.mgt.springboot.workstation;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.consulting.mgt.springboot.workstation.model.Workstation;
import com.consulting.mgt.springboot.workstation.repository.WorkstationRepository;
import com.consulting.mgt.springboot.workstation.utils.HRUtils;

@SpringBootApplication
public class AcmeHrWorkstationApplication {
	public static void main(String[] args) {
		SpringApplication.run(AcmeHrWorkstationApplication.class, args);
	}
	
	private WorkstationRepository workstationRepository;
	
	
	public AcmeHrWorkstationApplication(WorkstationRepository workstationRepository) {
		this.workstationRepository = workstationRepository;
	}
	
	@Bean
	public CommandLineRunner startup() {
		return (args) ->{
		Workstation workstation = Workstation.builder().vendor("MAC").model("Mac Book Pro 15")
				.serialNumber(HRUtils.nextFacilitiesSerialNumber()).build();
		
		workstationRepository.save(workstation);
		
		workstation = Workstation.builder().vendor("MAC").model("Mac Book Pro 13")
				.serialNumber(HRUtils.nextFacilitiesSerialNumber()).build();
		
		workstationRepository.save(workstation);
		
		List<Workstation> lstWork = (List<Workstation>) workstationRepository.findbyVendor("MAC");
		for(Workstation workst : lstWork ) {
			System.out.println(workst.toString());
		}
		
		};
	}
	
}
