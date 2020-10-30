class Student
{
	int number;
	String name;
	double score;
	
	Student(){}
	
	Student(int number)
	{
		this.number = number;
	}
	
	Student(int number, String name)
	{
		this(number);
		this.name = name;
	}
	
	Student(int number, String name, double score)
	{
		this(number, name);
		this.score = score;
	}
	
	void StudentPrint()
	{
		System.out.printf("number : %d, name : %s, score : %f", this.number, this.name, this.score);
	}
	
}
public class Code113
{
	public static void main(String[] args)
	{
		Student s = new Student(10, "Paul", 88.5);
		Student s1 = new Student(20, "Som", 89.9);
		s.StudentPrint();
		System.out.println();
		s1.StudentPrint();
	}

}
