import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyCtxListener implements ServletContextAttributeListener
{

	@Override
	public void attributeAdded(ServletContextAttributeEvent e) {
		System.out.println("Attribute "+e.getName()+" with the value "+e.getValue()+" is added");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent e) {
		System.out.println("Attribute "+e.getName()+" with the value "+e.getValue()+" is Removed");		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent e) {
		System.out.println("Attribute "+e.getName()+" with the value "+e.getValue()+" is Replaced");		
	}

}
