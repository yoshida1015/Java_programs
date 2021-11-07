//61720435
public class MyVector {
	private double[] elements;
	static int count;
	
	public MyVector() {
		elements = new double[] {0.0,0.0};
		count=0;
	}
	
	public MyVector(double x,double y) {
		elements = new double[] {x,y};
		count++;
	}
	
	MyVector constMult(double k) {
		elements[0]*=k;
		elements[1]*=k;
		return this;
	}
	
	double getLength() {
		double a,b,l;
		a=elements[0];
		b=elements[1];
		l=Math.sqrt(a*a+b*b);
		return l;
	}
	
	boolean isEqual(MyVector v) {
		if(elements[0]==v.elements[0] && elements[1]==v.elements[1]) {
			return true;
		}
		return false;
	}
	
	static int getNumVec() {
		return count;
	}
	
	void print() {
		System.out.println("("+elements[0]+","+elements[1]+")");
	}
}