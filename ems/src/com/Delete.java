package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	LoginDB db = new LoginDB();

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
				db.delete(id);
			
		
		
	}

	

}
