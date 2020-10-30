package filetest;

import java.io.FileInputStream;
import java.io.IOException;

public class Code211 
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("data1.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		}
		catch(IOException e)
		{
			System.out.printf("Exception : %s\n", e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
			}
			catch(IOException e)
			{
				System.out.printf("Exception : %s\n", e.getMessage());
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				System.out.printf("Exception : %s\n", e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
