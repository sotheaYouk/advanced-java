
public class Main {

	public static void main(String[] args) 
	{
		Charger icharger = new AllChargerAdapter();
		ConnectCharger cc = new ConnectCharger();
		
		cc.setCharger(icharger);
		cc.connectCharger();
		
	}

}

//blueprint for iPhone charger only
interface Charger 
{
	public void putCharger();
}

//used to set and connect charger 
class ConnectCharger 
{
	Charger charger;

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	//used to connect the desired charger 
	public void connectCharger()
	{
		charger.putCharger();
	}
}



class iphoneCharger implements Charger 
{

	@Override
	public void putCharger() {
		System.out.println("iPhone charger connected");
		
	}
	
	
}


class SamsungCharger
{
	public void connectSamsungCharger()
	{
		System.out.println("Samsung charger connected");
	}
}

//the adapter class which houses all kinds of adapter 
class AllChargerAdapter implements Charger 
{
	SamsungCharger sch = new SamsungCharger();

	@Override
	public void putCharger() {
		sch.connectSamsungCharger();
	}
	
	
}





