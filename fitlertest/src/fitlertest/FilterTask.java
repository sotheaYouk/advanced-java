package fitlertest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FilterTask implements Filter
{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
	
		
		PrintWriter out = res.getWriter();
		
		out.println("before filter");
		//BufferedWriter bw = new BufferedWriter (new FileWriter("log.txt", true));
		//log.txt is created in the container 
		
		
		String remoteAddr = req.getRemoteAddr();
		String requestURI = ((HttpServletRequest)req).getRequestURI();
		
		/*getREqeustURI() is available only the HttpServletRequest class which is the sub class of ServletRequest. 
		that's why we need to convert to HttpServletRequest in order to work in doFilter(which has the parent class)
		*/
		
		String protocol = req.getProtocol();
		System.out.println(remoteAddr + " has sent a " + protocol+ " request to " + requestURI);
//		bw.write(remoteAddr + " has semt a " + protocol+ " request to " + requestURI);
//		bw.close();
//		
		chain.doFilter(req, res);
		out.println("after filter");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	

}
