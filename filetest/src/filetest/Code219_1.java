package filetest;

import java.io.FileReader;
import java.io.IOException;

public class Code219_1
{
	public static void main(String[] args)
	{
		FileReader fis = null;
		char [] ch = new char[16];
		try
		{
			fis = new FileReader("data3.txt");
			int x= fis.read(ch, 3, 5);
			
			for(char c : ch)
			{
				System.out.print(c);
			}
			
			
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
			}
		}
	}
}
