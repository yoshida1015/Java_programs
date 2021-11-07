//61720435
public class Prob64 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No numbers!");
			return;
		}
		for(int i=0;i<args.length;i++) {
			int k;
			k=args[i].length();
			int a[]=new int[k];
			int t=0;
			for(t=0;t<k;t++) {
				a[t]=Character.getNumericValue(args[i].charAt(t));
			}
			int n[]=new int[k];
			
			for(t=0;t<k;t++) {
				n[t]=a[k-1-t];
			}
			int s1=0,s2=0;
			//0から始まるから奇数番目は2で割り切れるもの
			for(t=0;t<k;t++) {
				if(t%2==0) {
					s1+=n[t];
				}
			}
			for(t=0;t<k;t++) {
				if(t%2==1) {
					if(n[t]*2>=10) {
						s2+=n[t]*2-10+1;
					}else {
						s2+=n[t]*2;
					}
				}
			}
			int s=s1+s2;
			String judge;
			if(s%10==0) {
				judge="Good";
			}else {
				judge="Bad";
			}
			System.out.println(args[i]+" "+s+" "+judge);
		}
	}
}
