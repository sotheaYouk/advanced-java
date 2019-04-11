package fitlertest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckNull implements Filter {

	@Override
	public void destroy() {

	System.out.println("destroy....");		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		String username = req.getParameter("user");
		String email = req.getParameter("email");
		if(username != "" && email !="")
			chain.doFilter(req, res);
		else 
		{
			System.out.println("console");
			req.getRequestDispatcher("index.html").forward(req, res);	
		}
			
				
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("create....");	
		
	}
	
	

}
