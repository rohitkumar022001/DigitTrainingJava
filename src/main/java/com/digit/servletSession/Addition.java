package com.digit.servletSession;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class Addition extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int sum=num1+num2;
		HttpSession session=req.getSession(true);
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("sum", sum);
		RequestDispatcher reqd=req.getRequestDispatcher("/mul");
		reqd.forward(req, resp);
		
		
	
	}
}
