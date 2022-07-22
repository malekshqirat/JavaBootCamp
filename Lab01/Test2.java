package Lab01;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time= (int)(Math.random()*(350-100+1)+100);
		
		System.out.println("Movie time in minutes: " + time + " m");
		//Movie time in minutes
		System.out.println("Movie time in hours and minutes: " + time/60 + "h" + " " + time%60 + "m");
		//Movie time in hours and minutes

	}

}
