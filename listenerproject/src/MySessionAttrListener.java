import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAttrListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent s) {
		System.out.println("new attribute " +s.getName()+ " is added. The value is " +s.getValue());
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent s) {
		System.out.println(" attribute " +s.getName()+ " is removed. The value is " +s.getValue());

		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent s) {
		System.out.println(" attribute " +s.getName()+ " is replaced. The value is " +s.getValue());

		
	}

	
	
	
	
	

}
