class Data
{
	static int x;
	int y;
	
	Data(int x, int y)
	{
		Data.x = x;
		this.y = y;
	}
	
	static void print()
	{
		System.out.println("x : " + x);
	}
}

public class Code116
{
	public static void main(String[] args)
	{
		Data d = new Data(10, 20);
		d.print();
		System.out.println("y : " + d.y);
	}
}