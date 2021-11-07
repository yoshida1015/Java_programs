//61720435
public class Prob75 {
	public static void main(String[] args) {
		try {
			int ans;
			ans=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
			System.out.println(ans);
		}catch(ArithmeticException e) {
			System.out.println(" Denominator must not be zero! ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter two numbers! ");
		}
	}
}
