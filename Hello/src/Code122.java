class Point
{
	private int x;
	private int y;
	
	Point(){}
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	int getX()	//x의 접근자
	{
		return x;	
	}
	int getY()	//y의 접근자
	{
		return y;
	}
	
	void setX(int x)	//x의 제어자
	{
		this.x = x;
	}
	void setY(int y)	//y의 제어자
	{
		this.y = y;
	}
	static
	{
		System.out.println("static Block");
	}
	{
		System.out.println("non-static Block");
	}
}
public class Code122 
{
	static void add(Point t1, Point t2)
	{
		Point pt = new Point();	//Point클래스 내부의 메소드를 이용하기 위해 인스턴스 생성
		pt.setX(t1.getX() + t2.getX());
		pt.setY(t1.getY() + t2.getY());
		System.out.println("p1 + p2 : (" + pt.getX() + ", " + pt.getY() + ")");
		
		
	}
	
	public static void main(String[] args)
	{
		Point p1 = new Point(1, 3);
		Point p2 = new Point(5, 8);
		
		System.out.println("p1 : (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("p2 : (" + p2.getX() + ", " + p2.getY() + ")");
		add(p1, p2);
	}
}
