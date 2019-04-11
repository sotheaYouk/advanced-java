//main class 
public class Main {

	public static void main(String[] args) 
	{
		System.out.println("enter open");
		
		//creating an obj for FactoryClass class
		FactoryClass fc = new FactoryClass();
		
		//call the getInstance method then assign the returned
		//value(object) to an object of OS Interface
		OS obj = fc.getInstance("open");
		
		//call the function impl 
		obj.spec();

	}

}


//IOS class
class IOS implements OS{
	
	@Override
	public void spec()
	{
		System.out.println("I am from IOS");
	}
	
}


//Android class
class Android implements OS{
	
	@Override
	public void spec()
	{
		System.out.println("I am from Adroid");
	}
	
}


//Windows class
class Windows implements OS{
	
	@Override
	public void spec()
	{
		System.out.println("I am from Windows");
	}
	
}


//factory class
class FactoryClass{
	
	public OS getInstance(String str)
	{
		if(str.equals("open")) return new Android();
		else if (str.equals("closse")) return new IOS();
		else return new Windows();
			
	}
}







