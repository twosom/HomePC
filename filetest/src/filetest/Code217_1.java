package filetest;

import java.io.FileInputStream;
import java.io.IOException;

public class Code217_1
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		byte [] b = new byte[50];
		try
		{
			fis = new FileInputStream("data1.txt");
			fis.
			read(b);
			
			for(byte x : b)
			{
				System.out.print((char)x);
			}
		}
		catch(IOException e)
		{
			
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
			}
		}
	}

}
