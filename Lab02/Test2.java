package Lab02;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num = (int)(Math.random()*101);
		
		System.out.println("The number is: " + " " + num);
		
		if(num<=50)
			System.out.println("Small!");
		else
			System.out.println("Big");
		
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");


	}

}
