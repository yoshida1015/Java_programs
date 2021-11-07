//61720435
public class Prob210 {
	public static void main(String[] args) {
		MyCircle c=new MyCircle();
		c.setCircle(20,19,4);
		double M,L;
		M=c.computeArea();
		L=c.computeCircumference();
		System.out.println("The area of the circle is "+M+", and the circumference is "+L);
	}
}
