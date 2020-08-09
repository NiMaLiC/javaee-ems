package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Update")
public class Update extends HttpServlet{
	LoginDB db = new LoginDB();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String type = request.getParameter("type");
		String id = request.getParameter("id");
		db.update(email, pass, type, name, age,id);
	}

}
