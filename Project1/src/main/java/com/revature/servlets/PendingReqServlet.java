package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.implement.ManagerService;
import com.revature.objects.Employee;
import com.revature.objects.Reimbursement;

public class PendingReqServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpSession session = req.getSession();
//		PrintWriter pw = resp.getWriter();
//		resp.setContentType("text/html");
//		req.getRequestDispatcher("EmployeeProfile.html").include(req, resp);
//		ManagerService Mdao = new ManagerService();
//		List<Employee> EmpList = Mdao.viewEmp();
//		for(Employee accounts : EmpList){
//			pw.println(accounts);
//		}
			HttpSession session = req.getSession();
			resp.setContentType("text/HTML");
			ManagerService Mdao = new ManagerService();
			List<Reimbursement> ReqList = Mdao.pendingReq();
			for(Reimbursement accounts : ReqList){
				resp.getWriter().write(accounts.toString());
			}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
	}
}