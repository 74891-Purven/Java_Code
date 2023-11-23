package pkg1;

public class Mathoperation {
	
	public void displayNumbers() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" ");
			
		}
		System.out.println("-----\n fun over ends-----");
	}
	
	public void showNumber(int num) {
		
		for(int i=1;i<=num;i++)
			System.out.println(i+"");
		
	}
	
	public int add(int a,int b) {
		
		int c=a+b;
		return c;
	}
	
	public int add3(int i,int j,int k) {
		
		System.out.println("----add3----");
		return i+j+k;
	}
		
	}
	

