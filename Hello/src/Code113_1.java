class FriendCode113
{
	String name;
	int age;
	
	FriendCode113(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void hello()
	{
		System.out.println("Hello world");
	}
	
	void printFriend()
	{
		this.hello();
		System.out.println("name : " + name + "\nage : " + age);
	}
}
public class Code113_1 
{
	public static void main(String[] args)
	{
		FriendCode113 fNew = new FriendCode113("Somang", 26);
		
		fNew.printFriend();
	}
	
}
