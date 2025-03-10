package servlet_CRUD;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	long mobile=Long.parseLong(req.getParameter("mobile"));
	int sal=Integer.parseInt(req.getParameter("salary"));
	Employee emp=new Employee();
	emp.setEmpName(name);
	emp.setEmpEmail(email);	
	emp.setEmpMobile(mobile);
	emp.setEmpSalary(sal);
	
//	EntityManagerFactory factory=Persistence.createEntityManagerFactory("E3");
//	EntityManager manager = factory.createEntityManager();
//	EntityTransaction transaction = manager.getTransaction();
	new DatabaseLogic().insert(emp);
//	transaction.begin();
//	manager.persist(employee);
//	transaction.commit();
	resp.getWriter().print("<h1 align='center'> Record inserted success! </h1>");
	req.getRequestDispatcher("index.html").include(req, resp);
}
}

