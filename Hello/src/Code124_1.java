public class Code124_1
{
	static Point add(Point t1, Point t2, Point t3)
	{
		t3.setX(t1.getX() + t2.getX());
		t3.setY(t1.getY() + t2.getY());
		
		return t3;
	}
	
	public static void main(String[] args)
	{
		Point p1 = new Point(10, 20);
		Point p2 = new Point(11, 33);
		Point p3 = new Point();
		
		Point p4 = add(p1, p2, p3);
		
		System.out.println("p3 : (" + p3.getX() + ", " + p3.getY() + ")");
		System.out.println("p4 : (" + p4.getX() + ", " + p4.getY() + ")");
		
		System.out.println("p3 == p4 : " + (p3 == p4));
	}
}