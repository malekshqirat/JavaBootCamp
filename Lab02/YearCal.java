package Lab02;

public class YearCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = (int)(Math.random()*((2022-1+1)+1));
		//int year = 2012; a leap year
		
		if( year%4 == 0 && year%100 != 0)
			System.out.println("This is the year: " + year + ", and it is a leap year!");
		else
			System.out.println("This is the year: " + year + ", and it is not a leap year!");

	}

}
