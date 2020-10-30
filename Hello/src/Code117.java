class Block
{
	Block()
	{
		System.out.println("I am constructor");
	}
	{
		System.out.println("I am block");	//non-static 영역. 생성자보다 먼저 호출
											//인스턴스를 생성할 때마다 수행되는 영역.
	}
}
public class Code117 
{
	public static void main(String[] args)
	{
		Block b1 = new Block();
		Block b2 = new Block();
	}
}
