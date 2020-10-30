package filetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code214
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("input.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("input.txt는 없는 파일입니다.");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				fis.close();
			}
			catch(NullPointerException e)
			{
				System.out.println("fis가 null값을 갖고 있습니다.");
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		
	}
}
