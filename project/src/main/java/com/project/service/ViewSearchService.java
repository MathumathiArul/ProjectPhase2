package com.project.service;

import java.util.List;

import com.project.exception.BusinessException;
import com.project.model.Report;


public interface ViewSearchService {
	public List<Report> getReportByName(String name) throws BusinessException;

	
}
