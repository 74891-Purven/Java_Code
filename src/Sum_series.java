import java.util.Scanner;
public class Sum_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int total,num;
		System.out.println("enter the num :");
		num=sc.nextInt();
		int i=0;
		int cnt=0;
		for(i=1;i<=num;i++) {
			
			cnt=cnt+i;
			
		}
		System.out.println(cnt);
			
		
	}

}
