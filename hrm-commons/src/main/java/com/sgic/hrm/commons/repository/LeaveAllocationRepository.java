package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.LeaveAllocation;

public interface LeaveAllocationRepository extends JpaRepository<LeaveAllocation, Integer>{

}
