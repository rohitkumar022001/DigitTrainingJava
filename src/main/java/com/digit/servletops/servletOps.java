package com.digit.servletops;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletOps")
public class servletOps extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=resp.getWriter();
		writer.println("service");
		writer.println(req.getParameter("cname"));
		writer.println(req.getParameter("id"));
		writer.println(req.getParameter("password"));
		writer.println(req.getParameter("salary"));
		writer.println(req.getParameter("hike"));
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=resp.getWriter();
		writer.println("post");
		writer.println(req.getParameter("cname"));
		writer.println(req.getParameter("id"));
		//writer.println(req.getParameter("password"));
		writer.println(req.getParameter("salary"));
		writer.println(req.getParameter("hike"));
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=resp.getWriter();
		writer.println("get");
		writer.println(req.getParameter("cname"));
		writer.println(req.getParameter("id"));
		writer.println(req.getParameter("password"));
		writer.println(req.getParameter("salary"));
		writer.println(req.getParameter("hike"));
		
		
	}

}
