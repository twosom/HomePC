
public class lottoInput 
{	
	public static void main(String[]args)
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int [] lottoNums = new int[6];
		
		Outer : for(int i = 0; i < lottoNums.length; i ++)
		{
			System.out.printf("%d번 번호를 입력하세요 : ", i+1);
			lottoNums[i] = scan.nextInt();
			
			if(lottoNums[i] < 0 || lottoNums[i] > 45)
			{
				System.out.printf("잘못 입력하셨습니다.\n"
						+ "1~45까지의 정수 중에서 입력해주세요\n");
				i = i - 1;
				continue Outer;
			}
			
			if(i>0)
			{
				for(int j = 0; j < i; j ++)
				{
					if(lottoNums[i] == lottoNums[j])
					{
						System.out.printf("중복된 번호를 입력하셨습니다.\n");
						i = i - 1;
						continue Outer;
					}
				}
			}
			
			
		}
		System.out.println("당신이 입력한 로또번호는");
		for(int Num : lottoNums)
		{
			System.out.printf("%-3d", Num);
		}
		System.out.println("입니다.");
		scan.close();
			
	}
}
