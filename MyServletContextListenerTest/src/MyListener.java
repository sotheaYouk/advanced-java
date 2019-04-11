import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener
{
	@Override
	public void contextDestroyed(ServletContextEvent e) 
	{
		System.out.println("Context for your application is destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent e) 
	{
		System.out.println("Context for your application is created");
	}

}
