import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		System.out.println("Enter which no u want to add");
		num=scanner.nextInt();
		int store=0,result=0;
		while(num>0)  {  //num=543
			store=num%10;          // 3  4    5
			num=num/10;            //54  5    0
			result=result*10+store;//3   34   345
			
		}
		System.out.println("The reverse order of the no is="+result);
	}

}
