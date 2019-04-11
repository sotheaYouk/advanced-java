

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogOutPage extends HttpServlet {
	
    public void logout(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
    	
    	HttpSession ses = req.getSession();
    	ses.invalidate();
    	req.getRequestDispatcher("index.html").forward(req, res);	
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logout(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logout(request, response);
	}

}
