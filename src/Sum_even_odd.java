import java.util.Scanner;
public class Sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num,even_sum,odd_sum;
		System.out.println("enter num");
		num=sc.nextInt();
				
		even_sum=0;
		odd_sum=0;
		int i=0;
		for(i=1;i<=num;i++) {
			
			if(i%2==0) {
				
				even_sum=even_sum+i;
				
			}
			
			else if (i%2!=0){
				odd_sum=odd_sum+i;
			}
		}
		
		System.out.println(even_sum);
		System.out.println(odd_sum);
				
	}

}
