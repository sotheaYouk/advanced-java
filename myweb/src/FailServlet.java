

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FailServlet")
public class FailServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		HttpSession ses = req.getSession();
		
		String out = (String) ses.getAttribute("user");		
		pw.println("Welcome to Fail page " + out + "\n");
		
		
		resp.setContentType("text/html");
		pw.println("click on "+"<a href= 'LogOutPage'> Logout</a> " + " to logout of the session");
		
		
				
	}
	
}
