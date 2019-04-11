

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("user");
		String password = req.getParameter("pwd");
		
		//out.println("welcome " +sreq.getParameter("user") + " your passowrd is " + req.getParameter("pwd"));
		
		out.println("welcome " + name + " password: " + password);
		
		//hidden form field 
		out.println("<form action='ThirdServlet'>"
              + "<input type='hidden' name='user' value='"+name+"'/>"
              + "<input type = 'hidden' name = 'pwd' value = '"+password+"'/>"
              + "<input type='submit' value='Third'/> "
              + "</form>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
       
    
}
