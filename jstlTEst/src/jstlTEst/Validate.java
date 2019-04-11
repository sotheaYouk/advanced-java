package jstlTEst;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validate")
public class Validate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(123, "Jennie"));
		list.add(new Employee(869, "Jisoo"));
		list.add(new Employee(693, "Joy"));
		list.add(new Employee(823, "Juhyun"));
		
		req.setAttribute("emp", list);
		req.getRequestDispatcher("Process.jsp").forward(req, resp);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
	
	

}
