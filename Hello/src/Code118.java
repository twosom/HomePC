class BlockCode118
{
	BlockCode118()
	{
		System.out.println("I am constructor");
	}
	static
	{
		System.out.println("I am static block");
	}
	
}
public class Code118
{
	public static void main(String[] args)
	{
		BlockCode118 b1 = new BlockCode118();
		BlockCode118 b2 = new BlockCode118();
	}
}
