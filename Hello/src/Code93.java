class Car{
	String kind;
	String color;
	int year;
	
	void run() {
		System.out.println("Car is running");
	}
	void speedUp() {
		System.out.println("Car is speeding up");
	}
	
	static int testInt(int x)
	{
		int result = 0;
		result = x * x;
		return result;
	}
}

public class Code93 {
	public static void main(String[] args)
	{
		Car myCar;
		myCar = new Car();
		myCar.kind = "Sonata";
		myCar.color = "white";
		myCar.year = 2015;
		
		Car yourCar = new Car();
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2017;
		
		myCar.run();
		yourCar.run();
		
		myCar.speedUp();
		yourCar.speedUp();
		
		System.out.println(myCar.testInt(5));
		System.out.println(yourCar.testInt(15));
		
		System.out.println(myCar);
		System.out.println(yourCar);
	}
	

}
