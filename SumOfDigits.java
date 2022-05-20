import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int num;
		System.out.println("Enter which no u want to add");
		num=scanner.nextInt();
		int store=0,result=0;
		while(num>0)  {         //725
			store=num%10;       //5   2   2
			num=num/10;         //72  7   0
			result=result+store;//5   12  14
			
		}System.out.println("The sum of digit is"+result);
		
	}

}
