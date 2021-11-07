//61720435
public class Prob64 {
	public static void main(String[] args) {
		int x=1;
		for(int i=0;i<args.length;i++) {
			x*=Integer.valueOf(args[i]);
		}
		System.out.println(x);
	}
}
