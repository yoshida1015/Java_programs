//61720435
public class Prob28 {
	public static void main(String[] args) {
		ComplexNumber c1=new ComplexNumber();
		c1.R=1;
		c1.i=2;
		c1.print();
		double c1D=c1.abs();
		System.out.println("絶対値は"+c1D+"です");
		ComplexNumber c2=new ComplexNumber();
		c2.R=3;
		c2.i=4;
		c2.print();
		double c2D=c2.abs();
		System.out.println("絶対値は"+c2D+"です");
	}
}
