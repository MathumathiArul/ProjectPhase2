package com.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.LoginDAO;
import com.project.dbutil.MySqlConnection;
import com.project.exception.BusinessException;
import com.project.model.Admin;


public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean isValidLoginCredentials(Admin admin) throws BusinessException {
		boolean b=false;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="Select Admin_ID from admin where Admin_ID=? and Password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, admin.getAdminID());
			preparedStatement.setString(2, admin.getPassword());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("No Admin matching with the entered AdminID and password");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured kindly contact SYSADMIN");
		}
		return b;
	}

	

}
	
