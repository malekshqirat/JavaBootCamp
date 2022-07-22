package Lab01;



public class ReturnBiggerValue {

	public int ReturnTheBiggerNumber() {
		
		int num1= (int)(Math.random()*101);
		int num2= (int)(Math.random()*101);
		
		System.out.println("num1 =" + num1 + " , " + "num2 " + num2);
		
		if(num1>num2)
			return num1;
		else
			return num2;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnBiggerValue R1 = new ReturnBiggerValue();
		System.out.println("The bigger is " + R1.ReturnTheBiggerNumber());

	}

}
