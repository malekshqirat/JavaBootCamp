package Lab02;

public class Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*101);
		
		System.out.println("The number is: " + " " + num);
		
		if(num>50)
			System.out.println("Big!");
		else if(num<50)
			System.out.println("Small!");
		else
			System.out.println("Bingo");

	}

}
