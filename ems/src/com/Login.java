package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
       LoginDB login = new LoginDB();
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String type = request.getParameter("type");
		PrintWriter out = response.getWriter();
		
		if (email.equals("admin@gmail.com") && pass.equals("admin") && type.equals("admin")) {

			session.setAttribute("emailid", email);
				response.sendRedirect("welcomeadmin.jsp");
		}
				else if(login.check(email, pass,type) && type.equals("manager")) {
					session.setAttribute("emailid", email);
					response.sendRedirect("welcomemanager.jsp");
				}
			
		else {
			response.sendRedirect("login.jsp");
		}
		
	}

	
}
