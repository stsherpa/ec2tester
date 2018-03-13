package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.revature.implement.EmployeeService;
import com.revature.implement.ManagerService;

public class RequestServlet extends HttpServlet{
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
		
		Double amount = new Double (req.getParameter("amount"));
		String description = req.getParameter("description");
		Integer type = new Integer (req.getParameter("type"));
		System.out.println("good so far");
		Part pic = req.getPart("image");
		System.out.println("surprised if this prints");
		//Blob pic = (req.getParameter("image")).getBytes();
		Integer id = (Integer) session.getAttribute("id");
		EmployeeService Edao = new EmployeeService();

		Edao.reimburseReq(amount, description,pic, id, type);
		System.out.println("got here");
		resp.sendRedirect("EmployeeProfile.html");
	}
}
