package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.implement.EmployeeService;
import com.revature.implement.ManagerService;

public class ResolveServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
//		PrintWriter pw = resp.getWriter();
//		resp.setContentType("text/html");
//		req.getRequestDispatcher("Login.html").include(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		resp.setContentType("text/html");
		//PrintWriter pw = resp.getWriter();
		
		Integer reid = new Integer (req.getParameter("reid"));
		Integer type = new Integer (req.getParameter("type"));
		Integer id = (Integer) session.getAttribute("id");

		ManagerService Mdao = new ManagerService();

		Mdao.resolve(type, id, reid);
		resp.sendRedirect("ManagerProfile.html");
	}
}
