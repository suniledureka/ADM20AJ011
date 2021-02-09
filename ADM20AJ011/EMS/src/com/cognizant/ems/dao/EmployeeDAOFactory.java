package com.cognizant.ems.dao;

public class EmployeeDAOFactory {
 private static EmployeeDAO dao = null;
 public static EmployeeDAO getEmployeeDAO() throws Exception{
	 if(dao == null) {
		 dao = new EmployeeDAOImpl();
	 }
	 return dao;
 }
}
