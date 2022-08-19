package com.adarsh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) {
	String n=req.getParameter("login_name");
	try {
		PrintWriter p=res.getWriter();
		p.println(n);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}