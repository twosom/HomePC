class Person
{
	static int count;
	String name;
	
	Person()	//Person클래스의 인스턴스를 만들때마다 count숫자가 1씩 증가
	{
		count ++;
	}
	
	static void printCounter()	//static메소드에서는 static멤버만 사용할 수 있다.
	{
		System.out.println("count : " + count);
		
	}
	
}
public class Code115 
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person.printCounter();	//클래스명.메소드명()으로 사용.
		p1.printCounter();	//인스턴스명.메소드명()으로 사용해도 됨
		p2.printCounter();	//인스턴스명.메소드명()으로 사용해도 됨
		
	}
}
