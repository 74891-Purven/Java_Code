import java.util.Scanner;
public class Divby5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number: ");
		
		a=sc.nextInt();
		
		if(a%7==0 && a%5==0) {
			
			System.out.println("no. is div");
			
		}
		else {
			System.out.println("no is not divisiable");
		}
			
	}

}
