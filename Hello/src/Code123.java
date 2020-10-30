//class Point
//{
//	private int x;
//	private int y;
//	
//	Point(){}
//	Point(int x, int y)
//	{
//		this.x = x;
//		this.y = y;
//	}
//	
//	int getX()	//x의 접근자
//	{
//		return x;	
//	}
//	int getY()	//y의 접근자
//	{
//		return y;
//	}
//	
//	void setX(int x)	//x의 제어자
//	{
//		this.x = x;
//	}
//	void setY(int y)	//y의 제어자
//	{
//		this.y = y;
//	}
//}

public class Code123 
{
	static void change(Point t)	//매개변수 넣는 자리에 인스펙터 자료형을 넣기때문에
	{							//인스펙터의 클래스명을 적음.
								//Point p 의 참조값이 Point t에 들어감.
		
		//만약 Point클래스의 메소드도 사용하고싶다면...?
		//Point클래스의 인스펙터를 change클래스 안에 생성하면 된다
		Point test = new Point();	//non-static Block호출
		t.setX(10);
		t.setY(33);
		System.out.println("after : (" + t.getX() + ", " + t.getY() + ")");
		System.out.println("after 값 + 10");
		test.setX(t.getX() + 10);
		test.setY(t.getY() + 10);
		
		System.out.println("(" + test.getX() + ", " + test.getY() + ")");
		
	}
	
	
	public static void main(String[] args)
	{
		//딱 한번 staticBlock호출 후 각각 non-staticBlcok 호출
		Point p = new Point(2, 7);
		System.out.println("before : (" + p.getX() + ", " + p.getY() + ")");
		change(p);
		System.out.println("after : (" + p.getX() + ", " + p.getY() + ")");
	}
}
