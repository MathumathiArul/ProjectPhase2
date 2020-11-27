package com.project.service;

import com.project.exception.BusinessException;
import com.project.model.Admin;


public interface LoginService {

	public boolean isValidLoginCredentials(Admin admin) throws BusinessException;
}
