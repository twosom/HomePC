package singleton;

public class CarFactory 
{
	private static CarFactory instance = new CarFactory();
	private static int CarSerial = 10001;
	private CarFactory() {}
	
	public CarFactory getInstance()
	{
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	
	
}
