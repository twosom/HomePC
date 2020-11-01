package filetest;

import java.io.FileOutputStream;
import java.io.IOException;

public class Code223 
{
	public static void main(String[] args)
	{
		String content = "Hello Java Programming";
		byte [] bytes = content.getBytes();
		
		FileOutputStream fos = null;
		
		try
		{
			fos = new FileOutputStream("data4.txt");
			fos.write(bytes);
			
		}
		catch(IOException e)
		{
			System.out.printf("Exception : %s\n",e.getMessage());
		}
		finally
		{
			try
			{
				fos.close();
			}
			catch(IOException e)
			{
				System.out.printf("Exception : %s\n", e.getMessage());
			}
		}
	}
}
