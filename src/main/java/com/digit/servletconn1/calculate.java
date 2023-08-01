package com.digit.servletconn1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class calculate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int salary=Integer.parseInt(req.getParameter("salary"))+((Integer.parseInt(req.getParameter("salary"))*23)/100);
		req.setAttribute("req_cal",salary);
		RequestDispatcher reqd= req.getRequestDispatcher("/finalcal");
		reqd.forward(req, resp);
		
		
	}
	

}
