package pkg1;

public class MyMath {
	
	public void add() {
		
		System.out.println("----add()-----");
		
	}
		
	public void add(int a,int b) {
		System.out.println("-------add(a,b)--------");
		int c=a+b;
		System.out.println("add"+c);
	}
	
	public void add(double d1,double d2) {
		System.out.println("----add(d1,d2)-------");
		
		System.out.println("Add"+(d1+d2));
	}
	public void add(double d1,int a) {
		
		System.out.println("-----add(double,int)-----");
		System.out.println("Add: "+(d1+a));
	}
	
public void sum(int... numbers) {
		
		int total=0;
		System.out.println("Adding: "+numbers.length);
		for(int i=0;i<numbers.length;i++) {
			
			total=total+numbers[i];
		}
		System.out.println("toatl: "+total);
		
	}
	
	

	public void displayArray(int arr[]) {
		
		System.out.println("-----array------");
		for (int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]+" ");
			
		}
		
		
	}
	
}
