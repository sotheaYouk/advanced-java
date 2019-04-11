

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	
		String user = req.getParameter("user");
		PrintWriter pw = res.getWriter();	
		String username = user.toLowerCase();
		
		
		if(username.equals("sothea"))
		{
			req.setAttribute("user", user);
			req.getRequestDispatcher("/SecondServlet").forward(req, res);
		}
			
		else 
		{
			HttpSession ses = req.getSession();
			ses.setAttribute("user", username);
			RequestDispatcher rd = req.getRequestDispatcher("/FailServlet");
			rd.forward(req, res);
			
		}
			
				}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sex = request.getParameter("sex");
		PrintWriter pw = response.getWriter();
		
		if(sex.equalsIgnoreCase("male"))
			pw.println("sex = " + sex.toLowerCase());
		else if (sex.equalsIgnoreCase("female"))
			pw.println("sex = " + sex.toLowerCase());
		else 
			pw.println("invalid input");




		
	}
	
	

}
