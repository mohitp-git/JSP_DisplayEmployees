package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDetails;

public class IteratorExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Servlet");	
		 
		String type = request.getParameter("type");
		
		if(type.equals("getDetails"))
		{
		  		  
		  EmployeeDetails empDetails = new EmployeeDetails(0, 0, type, type);
		  
		  empDetails.getEmployeeDetails();
		  
		  request.setAttribute("EmpList", empDetails.getEmployeeDetails());
		
		  request.getRequestDispatcher("JSP/Iterator.jsp").forward(request, response); 		  
		}
	}
}