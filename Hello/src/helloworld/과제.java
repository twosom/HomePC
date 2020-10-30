package helloworld;

/*
 	1111*
 	111**
 	11***
 	1****
 	*****
 	
 	1은 공백
 	
 */
public class 과제 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i ++) {
			//공백 입력 for문
			for(int j = 1; j <= 5 - i; j ++) {
				System.out.printf(" ");
			}
			//*표 입력 for문
			for(int k = 1; k <=i; k ++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
