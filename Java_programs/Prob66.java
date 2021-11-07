//61720435
import static java.lang.Math.*;
public class Prob66 {
	public static void main(String[] args) {
		double r=6371;
		double d,la1,la2,lo1,lo2;
		la1=Double.parseDouble(args[0]);
		lo1=Double.parseDouble(args[1]);
		la2=Double.parseDouble(args[2]);
		lo2=Double.parseDouble(args[3]);
		d=2*r*asin(sqrt(pow(sin(toRadians((la2-la1)/2)),2)+cos(toRadians(la1))
		*cos(toRadians(la2))*pow(sin(toRadians((lo2-lo1)/2)),2)));
		System.out.println(d);
	}
}
