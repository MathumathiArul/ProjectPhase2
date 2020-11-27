package com.project.service.impl;

import com.project.dao.LoginDAO;
import com.project.dao.impl.LoginDAOImpl;
import com.project.exception.BusinessException;
import com.project.model.Admin;
import com.project.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDAO=new LoginDAOImpl();
	@Override
	public boolean isValidLoginCredentials(Admin admin) throws BusinessException {
		boolean b = false;
		if (admin != null && admin.getAdminID() != null && admin.getPassword() != null) {
			//write the code here for DAO
			b=loginDAO.isValidLoginCredentials(admin);
		}else {
			throw new BusinessException("Invalid AdminID/Password... Kindly Re-Enter");
		}
		return b;
	}

}
