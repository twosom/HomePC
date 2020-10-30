class Dog
{
	String name;
	int age;
}


public class Code94 
{
	public static void main(String[] args)
	{
		Dog happy = new Dog();
		Dog bella = new Dog();
		happy.name = "HAPPY";
		happy.age = 3;
		bella.name = "BELLA";
		bella.age = 2;
		
		System.out.println("나는 강아지 두 마리를 키웁니다.");
		System.out.println("한 마리는 이름이 " + happy.name +"이고, " +
							happy.age + "살입니다.");
		System.out.println("다른 한 마리는 이름이 " + bella.name + "이고, " +
							bella.age + "살입니다.");
	}
}
