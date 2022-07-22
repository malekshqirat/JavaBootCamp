package Lab01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= (int)(Math.random()*101);
		int b= (int)(Math.random()*101);
		
		System.out.println("a= " + a + " , " + "b= " + b);
		System.out.println("Sum= " + (a+b));
		System.out.println("Avarage= " + (a+b/2));
		System.out.println("Reminder of a= " + (a%10) + " ,Reminder of b= "+(b%10));
		System.out.println("Area of a rectangle by a&b= " + (a*b));

	}

}
