import java.util.Scanner;

public class Salary_Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sal,tax;
		tax=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sal: ");
		sal=sc.nextInt();
		
		
		if(sal<150000) {
			
			System.out.println("no tax");
			
		}
		
		else if(150000<sal&& sal<300000) {
			
			tax=sal*0.2;
			
			System.out.println("tax:"+tax);
			
			
			
		}
		
		else if(sal>300000) {
			
			tax=sal*0.3;
			
			System.out.println("tax:"+tax);
			
			sc.close();
		}
		
	}

}

