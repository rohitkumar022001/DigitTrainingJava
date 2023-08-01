package com.digit.servletconn1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/finalcal")
public class finalcal extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter writer=resp.getWriter();
		int salary1=(int)req.getAttribute("req_cal");
		int finalcal=salary1+((salary1*6)/100);
		writer.println("final: "+finalcal);
		
		
	}
	

}
