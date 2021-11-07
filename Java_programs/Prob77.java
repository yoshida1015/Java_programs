//61720435
import java.util.*;
public class Prob77 {
	public static void main(String[] args) {
		try {
			int a,b;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			ArrayList<Integer> oddn = new ArrayList<Integer>();
			int t=a,c=0;
			while(t>0) {
				if(t%2==1) {
					oddn.add(c);
				}
				t/=2;
				c++;
			}
			int[] b2=new int[c];
			t=b;
			int i;
			for(i=0;i<c;i++) {
				b2[i]=t;
				t*=2;
			}
			int ans=0;
			for(i=0;i<c;i++) {
				if(oddn.contains(i)) {
					ans+=b2[i];
				}
			}
			System.out.println(args[0]+" * "+args[1]+" = "+ans);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter two numbers! ");
		}catch(NumberFormatException e) {
			System.out.println("Please enter Integers! ");
		}
	}
}
