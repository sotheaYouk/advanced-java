import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		Cookie[] ck = req.getCookies();
		PrintWriter out = resp.getWriter();		
		out.print("These are your cookies: " + "<br>");
		
		for(Cookie cook: ck)
		{
			out.println("name: " + cook.getName() + " value: " + cook.getValue());
			out.println("<br>");
		}
			
		
		out.println("<br>"+"press logout to go back to the main page: " + "<br>");
		out.println("<a href='ThirdServlet'> logout</a>");
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		HttpSession ses = req.getSession();
//		PrintWriter out = resp.getWriter();
//		
//		String user = (String)ses.getAttribute("user");
		
	
		
	}
	

}
