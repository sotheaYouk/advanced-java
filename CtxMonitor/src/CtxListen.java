import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CtxListen implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent e) {

		System.out.println("Context object "+e+" is Destroyed...");
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("Context object "+e+" is Created...");		
	}

}
