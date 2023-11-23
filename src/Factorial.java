import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact,total;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		fact=sc.nextInt();
		
		 total=1;
		for(int i=1;i<=fact;i++) {
		
			total=total*i;
			
			
		}
		System.out.println(total);

	}

}
