import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your start and end number");
		int startNo=scanner.nextInt();
		int endNo=scanner.nextInt();
		for(int i=startNo;i<=endNo;i++) {
			if(i%3==0) {
			System.out.println("The no divisible by 3 is="+i);			
			}
			if(i%4==0) {
		      System.out.println("The no divisible by 4 is="+i);		
			}
			if(i%5==0) {
			      System.out.println("The no divisible by 5 is="+i);		
				}
		}scanner.close();
		
	}

}
