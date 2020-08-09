package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
	LoginDB db = new LoginDB();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String type = request.getParameter("type");
		int age = Integer.parseInt(request.getParameter("age"));
		String name = request.getParameter("name");
		db.insert(email, pass, type, name, age);
	}

	

}
