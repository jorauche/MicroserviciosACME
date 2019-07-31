package com.consulting.mgt.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consulting.mgt.springboot.employee.model.Desk;


public interface DeskRepository extends JpaRepository<Desk, Long> {

}
