package com.project.dao;

import java.util.List;

import com.project.exception.BusinessException;
import com.project.model.Report;


public interface ViewSearchDAO {

	public List<Report> getReportByName(String name) throws BusinessException;

}
