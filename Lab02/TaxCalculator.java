package Lab02;

public class TaxCalculator {
	
	public void CalculateTheTax(int amount)
	{
		int originalSalary = amount;
		int tax;
		int finalSalary;
		
		if( amount <= 23000) {
			
			tax = (int) (amount*0.1);
			finalSalary= originalSalary-tax;
			System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.1 " + ", Tax= " + tax + " , Net Salary= " + finalSalary);}//if statement end
			
		else if( amount > 23000 && amount <= 50000 ) {
			
			tax = (int)(amount*0.2);
			finalSalary= originalSalary-tax;
		    System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.2 " + ", Tax= "  + tax + " , Net Salary= " + finalSalary);}//else if statement end
	
		else if( amount < 50000 && amount <= 100000) {
			
			tax = (int)(amount*0.3);
			finalSalary= originalSalary-tax;
		    System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.3 " + ", Tax= "  + tax + " , Net Salary= " + finalSalary);}//else if statement end

		else {
			
			tax = (int)(amount*0.4);
			finalSalary= originalSalary-tax;
		    System.out.println("originalSalary: " + originalSalary + ", tax = originalSalary*0.4 " + ", Tax= "  + tax + " , Net Salary= " + finalSalary);}//else statement end
		
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = (int)(Math.random()*1000000);
		TaxCalculator Tax1 = new TaxCalculator();
		
		Tax1.CalculateTheTax(amount);
		

	}

}
