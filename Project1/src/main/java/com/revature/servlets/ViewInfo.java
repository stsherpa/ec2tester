package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.implement.EmployeeService;
import com.revature.implement.ManagerService;
import com.revature.objects.Employee;

public class ViewInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViewInfo() {
        super();
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		resp.setContentType("text/HTML");
		EmployeeService Edao = new EmployeeService();
		Integer id = (Integer) session.getAttribute("id");
		Employee emp = Edao.viewInfo(id);
		resp.getWriter().write(emp.toString());
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpSession session = req.getSession();
//		
//		resp.setContentType("text/html");
//		//PrintWriter pw = resp.getWriter();
//		
//		Double amount = new Double (req.getParameter("amount"));
//		String description = req.getParameter("description");
//		Integer type = new Integer (req.getParameter("type"));
//		Integer id = (Integer) session.getAttribute("id");
//		ManagerService Mdao = new ManagerService();
//		EmployeeService Edao = new EmployeeService();
//
//		Edao.reimburseReq(amount, description, id, type);
//		resp.sendRedirect("EmployeeAbout.html");
	}

}
