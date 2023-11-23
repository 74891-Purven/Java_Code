import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("enter the number: ");
		num=sc.nextInt();
		
		if(num%2==0) {
			
			System.out.println("num is even ");
		}			
			else {
				System.out.println("num is odd");
			}
			
		
		
		
	}

}
