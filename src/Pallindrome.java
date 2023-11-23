import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int num,dig,total;
		
		num=sc.nextInt();
		
		dig=0;
		total=0;
		int nn =num;
		while(num>0) {
			
			dig=num%10;
			total=total*10+dig;
			num=num/10;
			
		}
		System.out.println(total);
		if(total==nn) {
			
			System.out.println("pallindrome");
		} else {
			System.out.println("not pallindrome");
		}
		
	}

}
