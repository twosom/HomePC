package filetest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code221_1
{
	public static void main(String[] args)
	{
		File file = new File("test.txt");
		Scanner scan = null;
		
		String a = "";
		short b = 0;
		boolean c = false;
		float d = 0.0f;
		long e = 0;
		byte f = 0;
		int g = 0;
		double h = 0.0;
		boolean d2 = false;
		
		if(file.exists());
		{
			try
			{
				scan = new Scanner(file);
				a = scan.next();
				b = scan.nextShort();
				c = scan.nextBoolean();
				d = scan.nextFloat();
				d2 = scan.nextBoolean();
				e = scan.nextLong();
				f = scan.nextByte();
				g = scan.nextInt();
				h = scan.nextDouble();
			}
			catch(FileNotFoundException exp)
			{
				System.out.printf("Exception : %s\n", exp.getMessage());
			}
		}
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("d2 : " + d2);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
	}
}
