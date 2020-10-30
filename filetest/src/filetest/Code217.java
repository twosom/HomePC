package filetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code217
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		byte [] b = new byte[50];
		try
		{
			fis = new FileInputStream("data1.txt");
			fis.read(b);	//저장은 b에, 반환은 읽은 데이터의 바이트 수를 반환
			for(byte x : b)
			{
				System.out.print((char)x);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("data1.txt는 없는 파일입니다.");
		}
		catch(IOException e)
		{
			System.out.printf("Exception e : %s\n",e.getMessage());
			e.printStackTrace();
		}
	}
}
