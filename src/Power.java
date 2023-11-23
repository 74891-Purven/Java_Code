import java.lang.Math;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int m,n,sum;
		double total;
		
		System.out.println("enter num: ");
		m=sc.nextInt();
		
		System.out.println("power: ");
		
		n=sc.nextInt();		
		
		total=0;
		
		
		total=Math.pow(m,n);
			
		System.out.println((int)total);	
		
		//by different Method
		sum=1;
		for(int i=1;i<=n;i++) {
			
			sum=sum*m;
			
		}
		
		System.out.println(sum);
		
	}

}
