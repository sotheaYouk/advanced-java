import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ServRequestListener implements ServletRequestListener 
{
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("A request object is destroyed");
	}
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("A new req object is created...");
		
	}
	
}
