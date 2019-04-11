

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		

		
		ServletConfig con = getServletConfig();
		String color = con.getInitParameter("color");
		
		out.println("Color: " +  color);
		
		
		String user = req.getParameter("user");	
		String pwd = req.getParameter("pwd");
		
		//URL rewrite
		out.println("<a href= 'SecondServlet?user="+user+"&pwd="+pwd+"'> second</a>");
		
		
	}

}
