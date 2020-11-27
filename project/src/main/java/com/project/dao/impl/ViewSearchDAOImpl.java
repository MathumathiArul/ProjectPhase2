package com.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.project.dao.ViewSearchDAO;
import com.project.dbutil.MySqlConnection;
import com.project.exception.BusinessException;
import com.project.model.Report;


public class ViewSearchDAOImpl implements ViewSearchDAO {


	@Override
	public List<Report> getReportByName(String name) throws BusinessException {
		List<Report> repList=new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select student.name,student.class,class_subjects.subjectname,class_subjects.teachername "
					+ "from student left join class_subjects on student.class=class_subjects.classname where student.class=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Report report = new Report(resultSet.getString("name"),name,resultSet.getString("subjectname"),resultSet.getString("teachername"));
				repList.add(report);
			}
			
			if(repList.size()==0) {
				throw new BusinessException("No class found with name "+name);
			} 

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return repList;
	}

	
	

}
