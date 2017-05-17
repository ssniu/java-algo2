package javalang;

public class CalPI {

	public static void main(String[] args) {
		Cal c = new Cal();
		c.calmethod();

	}

}

class Cal{
	public final int NO_OF_TRIALS = 1000000;
	
	public int numberOfHits = 0;
	
	public void calmethod(){
	for(int i = 0; i < NO_OF_TRIALS; i++){
		double x = Math.random() * 2.0 - 1;
		double y = Math.random() * 2.0 - 1;
		
		if( x * x + y * y <= 1)
			numberOfHits++;
	}
	double pi = 4.0 * numberOfHits/NO_OF_TRIALS;
	System.out.println("PI is " + pi);
	}
}
