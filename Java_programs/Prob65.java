//61720435
import java.util.Random;
public class Prob65 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No number!");
			return;
		}
		if(args[0].equals("0")) {
			System.out.println("Not valid!");
			return;
		}
		Random r=new Random();
		int num=Integer.parseInt(args[0]);
		int a[]=new int[num];
		int t;
		for(t=0;t<num;t++) {
			a[t]=r.nextInt(10);
			System.out.print(a[t]);
		}
		System.out.println("");
		if(num%2==0) {
			for(t=0;t<=num/2-1;t++) {
				if(a[t*2]<a[t*2+1]) {
					System.out.print(a[t*2]);
					System.out.print(a[t*2+1]);
				}
			}
		}else {
			for(t=0;t<=(num-1)/2-1;t++) {
				if(a[t*2]<a[t*2+1]) {
					System.out.print(a[t*2]);
					System.out.print(a[t*2+1]);
				}
			}
		}
		System.out.println("");
	}
}
