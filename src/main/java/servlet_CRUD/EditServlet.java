package servlet_CRUD;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	
	Employee employee=new DatabaseLogic().fetch(id);
	
	req.setAttribute("emp", employee);
	req.getRequestDispatcher("edit.jsp").forward(req, resp);
	

}
}

