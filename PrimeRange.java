import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int startRange,endRange;
		int flag=0;
		System.out.println("Enter start range and end range numbers");
        startRange=scanner.nextInt();
        endRange=scanner.nextInt();
        List<Integer> prime=new LinkedList<Integer>();
        
        while(startRange<=endRange) {
        	flag=0;
        for (int i=2;i<startRange-1;i++)  {
        	if(startRange%i==0) {
        	flag=1;
        	break;
        }
        }
        
        if (flag==1)
        {
        	
        }
        else {
        	prime.add(startRange);
        }
        startRange++;
        }
        System.out.println(prime);
        } 
	}


