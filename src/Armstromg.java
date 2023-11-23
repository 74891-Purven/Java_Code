import java.lang.Math;
import java.util.Scanner;

public class Armstromg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int num,dig;
		double total;
		
		num=sc.nextInt();
		
		dig=0;
		total=0;
		while(num>0) {
			
			dig=num%10;
			total=(int)total+(int)Math.pow(dig,3);
			num=num/10;

	}
		System.out.println(total);

}
	
}
