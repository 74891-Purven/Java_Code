import java.util.Scanner;
public class Prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num,div;
		
		System.out.println("enter num: ");
		
		num=sc.nextInt();
		
		div=2;
		
//		while(div<num) {
//			
//			if(num%div==0) {
//				
//				System.out.println("not prime");
//				break;
//			}
//			
//			else {
//				div=div+1;
//				
//			}
//			
//		}
//		System.out.println("prime");
		
		
		boolean flag=true;
		for (int i=2;i<num;i++) {
			
			if(num%i==0) {
				
				flag=false;
				break;
			}
			else {
				flag=true;
			}
			
		}
		if(flag==true) {
			System.out.println("prime");
			
		}
		
		else {
			System.out.println("not prime");
		}
	}

}
