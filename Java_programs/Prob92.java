//61720435

public class Prob92 { 
	public void turnOn() {
		String TV=(new Object(){
			String x="Let's watch!";
			String getX() {
				return x;
			}
		}).getX();
      System.out.println(TV);
	}
   public static void main(String[] args) { 
	   Prob92 a = new Prob92();
	   a.turnOn();
	   }       
} 
