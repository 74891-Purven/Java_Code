import java.util.Scanner;
public class check_trainge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter the three angles of a triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a+b+c<=180) {
			System.out.println("The triangle is valid");
		}else {
			System.out.println("The triangle is not valid");
		}
		
	}

}
