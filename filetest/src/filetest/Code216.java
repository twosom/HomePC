package filetest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Code216
{
	public static void main(String [] args)
	{
		int i;
		String inFile = "input.txt";
		String outFile = "output.txt";
		
		try(FileInputStream fin = new FileInputStream(inFile);
				FileOutputStream fout = new FileOutputStream(outFile);)
		{
			do
			{
				i = fin.read();
				if(i != -1)
				{
					fout.write(i);
				}
				System.out.printf("Success!\n");
			}
			while(i != -1);
		}
		catch(IOException e)
		{
			System.out.printf("Exception : %s\n", e.getMessage());
			e.printStackTrace();
		}
	}
}
