package servlet_CRUD;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	long mobile=Long.parseLong(req.getParameter("mobile"));
	int sal=Integer.parseInt(req.getParameter("salary"));
	String id=req.getParameter("id");
	Employee emp=new Employee();
	emp.setEmpName(name);
	emp.setEmpEmail(email);	
	emp.setEmpMobile(mobile);
	emp.setEmpSalary(sal);
	emp.setEmpId(Integer.parseInt(id));
	 new DatabaseLogic().update(emp);
	 resp.getWriter().print("<h1 align='center'>Record Updated Success </h1>");
	 req.getRequestDispatcher("fetch").include(req, resp);
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//	}
}}

