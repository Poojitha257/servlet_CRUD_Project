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

@WebServlet("/delete")
public class Delete  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("E3");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		
//		Employee employee=manager.find(Employee.class, id);
//		
//		transaction.begin();
//		manager.remove(employee);
//		transaction.commit();
		new DatabaseLogic().delete(id);
		resp.getWriter().print("<h1 align='center'>Record Deleted Success</h1> ");
		req.getRequestDispatcher("fetch").include(req, resp);
	}

}

