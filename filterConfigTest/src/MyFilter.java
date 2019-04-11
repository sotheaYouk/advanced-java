import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter
{
	FilterConfig config = null;

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException 
	{
		String color = config.getInitParameter("color");
		res.getWriter().print("color: " + color);
		chain.doFilter(req, res);
		
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException 
	{
		this.config = config;
		
	}
	
	

}
