package com.project.dao;

import java.util.List;

import com.project.exception.BusinessException;
import com.project.model.Admin;




public interface LoginDAO {

	public boolean isValidLoginCredentials(Admin admin) throws BusinessException;
	
}
