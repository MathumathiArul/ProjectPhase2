package com.project.service.impl;

import java.util.List;

import com.project.dao.ViewSearchDAO;
import com.project.dao.impl.ViewSearchDAOImpl;
import com.project.exception.BusinessException;
import com.project.model.Report;

import com.project.service.ViewSearchService;

public class ViewSearchServiceImpl implements ViewSearchService {

	private ViewSearchDAO dao=new ViewSearchDAOImpl();
	
	

	@Override
	public List<Report> getReportByName(String name) throws BusinessException {
		List<Report> reportList=null;
		if(name!=null)
		{
		reportList=dao.getReportByName(name);
		}
		else
		{
			throw new BusinessException("Select a classname");
		}
		return reportList;
	}

}
