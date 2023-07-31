package com.digit.ServletLifeCycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycle1")
public class LifeCycle extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside the init method");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("rohit");
		System.out.println("Inside the service method");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside the Destroy Method");
	}
	

}
