package filetest;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Student
{
	private int no;
	private String name;
	private int score;
	
	Student(){}
	Student(int no, String name, int score)
	{
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	int getNo() {return no;}
	String getName() {return name;}
	int getScore() {return score;}
	
	@Override
	public String toString()
	{
		return no + ":" + name + "(" + score + ")";
	}
}


public class Code222
{
	public static void main(String[] args)
	{
		int i = 0;
		Student[] ST = new Student[10];
		File file = new File("student.txt");
		
		Scanner scan = null;
		try
		{
			scan = new Scanner(file);
			
			while(scan.hasNext())
			{
				int no = scan.nextInt();
				String name = scan.next();
				int score = scan.nextInt();
				
				ST[i] = new Student(no, name, score);
				i ++;
			}
		
			
		}
		catch(IOException e)
		{
			System.out.println("student.txt not exist");
		}
		scan.close();
		System.out.println("== Student List ==");
		System.out.println("------------------");
		
		for(Student s : ST)
		{
			System.out.println(s);
		}
		
	}
}