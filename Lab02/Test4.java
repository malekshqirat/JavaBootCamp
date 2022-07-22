package Lab02;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= (int)(Math.random()*101);
		int num2= (int)(Math.random()*101);
		int num3= (int)(Math.random()*101);
		int min= num1;
		
		System.out.println(num1 + " , "  +num2 + " , " + num3);

		if(num2 < min && num2 < num3)
			min =num2;
		else if (num3 < min && num3 < num2)
			min =num3;
		
		System.out.println(min);

	}

}
