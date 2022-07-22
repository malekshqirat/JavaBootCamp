package Lab02;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= (int)(Math.random()*101);
		int num2= (int)(Math.random()*101);
		int num3= (int)(Math.random()*101);
		int max= num1;
		
		System.out.println(num1 + " , "  +num2 + " , " + num3);

		if(num2 > max && num2 > num3)
			max =num2;
		else if (num3 > max && num3 > num2)
			max =num3;
		
		System.out.println(max);


	}

}
