import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	static int visitor = 0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		visitor = visitor + 1;
		
		
		String user = req.getParameter("user");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		out.print("visitor: "+ visitor + "<br>");
				
//		HttpSession ses = req.getSession();
//		ses.setAttribute("user", user);
		
//		RequestDispatcher rd = req.getRequestDispatcher("SecondServlet");
//		
//		rd.forward(req, resp);
		
		
		Cookie ck = new Cookie("user", user);
		resp.addCookie(ck);
		out.println("Press next for to see your cookies: " + "<br>");
		out.println("<a href = 'SecondServlet'> Next </a>");

		
		
	}

}
