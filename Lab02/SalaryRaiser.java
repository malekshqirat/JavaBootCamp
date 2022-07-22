package Lab02;

public class SalaryRaiser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*((6000-5000+1)+5000));
		
		System.out.println("Current Salary: " + num);
		
		if(num<6000)
			num+= num*0.1;
		else
			num+= num*0.05;
		
		System.out.println("Raised Salary: " + num);

	}

}
