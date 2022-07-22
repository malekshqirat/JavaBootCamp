package Lab02;

public class TaxCalculator {
	
	public void CalculateTheTax(int amount)
	{
		int originalSalary = amount;
		float tax;
		
		if( amount <= 23000) {
			
			tax = (float) (amount*0.1);
			System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.1 " + ", TaxPercentage= " + tax);}//if statement end
			
		else if( amount > 23000 && amount <= 50000 ) {
			
			tax = (float)(amount*0.2);
		    System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.2 " + ", TaxPercentage= "  + tax);}//else if statement end
	
		else if( amount < 50000 && amount <= 100000) {
			
			tax = (float)(amount*0.3);
		    System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.3 " + ", TaxPercentage= "  + tax);}//else if statement end

		else {
			
			tax = (float)(amount*0.4);
		    System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.4 " + ", TaxPercentage= "  + tax);}//else statement end
		
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = (int)(Math.random()*1000000);
		TaxCalculator Tax1 = new TaxCalculator();
		
		Tax1.CalculateTheTax(amount);
		

	}

}
