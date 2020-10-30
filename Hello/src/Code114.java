class Circle
{
	static double PI = 3.141592;
	double radius;
	
	Circle(double radius)	//매개변수가 double형인 생성자
	{
		this.radius = radius;
	}
	
	double area()	//Circle 클래스 내의 radius값의 제곱과 PI값을 곱해서 반환하는 메소드
	{
		return this.radius * this.radius * PI;
	}
	
	double perimeter()
	{
		return 2 * PI * this.radius;
	}
	
	
}
public class Code114
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(100.0);
		
		System.out.println("area of c1 : " + c1.area());
		System.out.println("perimeter of c1 : " + c1.perimeter());
		
		System.out.println("area of c2 : " + c2.area());
		System.out.println("perimeter of c2 : " + c2.perimeter());
		
		System.out.println("PI = " + Circle.PI);
	}
}
