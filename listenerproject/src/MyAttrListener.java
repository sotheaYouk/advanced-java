import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyAttrListener implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent s) {
	
		System.out.println("new attribute "+s.getName()+ " is added " +s.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent s) {
		System.out.println("the attribute "+s.getName()+ " is removed " +s.getValue());
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent s) {
		System.out.println(" attribute "+s.getName()+ " is replaced " +s.getValue());
		
	}
	
	
	

}
