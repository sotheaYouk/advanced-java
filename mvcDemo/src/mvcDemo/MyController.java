package mvcDemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyController")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("username");
		
		StudentModel sm = new StudentModel();
		sm.setUser(username);
		
		boolean res = sm.checkValues(sm);
		
		if (res)
			request.getRequestDispatcher("SuccessPage.jsp").forward(request, response);
		else 
			request.getRequestDispatcher("FailurePage.jsp").forward(request, response);
		
	}

}
