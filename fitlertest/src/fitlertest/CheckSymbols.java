package fitlertest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckSymbols implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		String username = req.getParameter("user");
		String email = req.getParameter("email");
		PrintWriter out = res.getWriter();
		int c1 = 0;
		int c2 = 0;
		
		for(char c: username.toCharArray())
		{
			int i = (int )c;
			
			if(i >= 0 && i <= 0 )				
				req.getRequestDispatcher("index.html").forward(req, res);							
		
		}
			
		System.out.println("hello world");
		for(char e: email.toCharArray())
			if(e == '@')
				c1 += 1;
		
		for(char e: email.toCharArray())
			if(e == '.')
				c2 += 1;
		if(c1 >0 && c2 >0)
			chain.doFilter(req, res);
		else 
			req.getRequestDispatcher("index.html").forward(req, res);
		
		
		/*
		 * for(char c : username.toCharArray)
		 * {
		 *		if(!Character.isDigit(c) || (email.contains('@') && email.contains('.')))
		 *			 
		 * }
		 * 
		 */
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	

}
