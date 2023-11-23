package pkg1;

public class Date {
	
	private int day,month,year;
	
	public void assignDate(int d,int m,int y) {
		
		day=d;
		month=m;
		year=y;
		System.out.println("date is assigned");
	}
	public void display() {
		
		System.out.println("date"+day+"/"+month+"/"+year);
	}
}
