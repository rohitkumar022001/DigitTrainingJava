package com.digit.servletconn1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletconn1")
public class servletconn1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		String empname=req.getParameter("name");
		String username=req.getParameter("uname");
		String pass=req.getParameter("password");
		String salary=req.getParameter("salary");
		String exp=req.getParameter("exp");
		RequestDispatcher reqd= req.getRequestDispatcher("/calculate");
		reqd.forward(req, resp);
		
		
		
	}
	

}
