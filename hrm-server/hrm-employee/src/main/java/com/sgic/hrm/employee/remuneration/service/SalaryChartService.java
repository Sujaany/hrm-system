package com.sgic.hrm.employee.remuneration.service;

import java.util.List;

import com.sgic.hrm.commons.entity.SalaryChartEntity;

public interface SalaryChartService {

	public List<SalaryChartEntity> viewSalaryChart();

	public Integer viewById(Integer id);
//	public List<SalaryChartEntity> viewOneById(Integer id);
}
