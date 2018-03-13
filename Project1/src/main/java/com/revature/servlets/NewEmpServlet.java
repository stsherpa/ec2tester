package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.implement.EmployeeService;
import com.revature.implement.ManagerService;
import com.revature.objects.Reimbursement;

public class NewEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		resp.setContentType("text/HTML");
		ManagerService Mdao = new ManagerService();
		List<Reimbursement> ReqList = Mdao.allReq();
		for(Reimbursement accounts : ReqList){
			resp.getWriter().write(accounts.toString());
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpSession session = req.getSession();
//		resp.setContentType("text/html");
//		PrintWriter pw = resp.getWriter();
//		System.out.println(req);
//		Integer id = new Integer(req.getParameter("empid"));
//		System.out.println(id);
//		ManagerService Mdao = new ManagerService();	
//		List<Reimbursement> ReqList = Mdao.empReq(id);
//		for(Reimbursement accounts : ReqList){
//			resp.getWriter().write(accounts.toString());
//			System.out.println(accounts.toString());
//		}
	}
}
