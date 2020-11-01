package filetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ㅅㄷㄴㅅ
{
	public static void main(String[] args)
	{
		
		
		try(FileInputStream fis = new FileInputStream(new File("data1.txt"));)
		{
			
			int x;
			while((x = fis.read()) != -1)
			{
				System.out.print((char)x);
			}
			
		}
		catch(IOException e)
		{
			System.out.printf("Exception : %s\n", e.getMessage());
		}
	}
}
