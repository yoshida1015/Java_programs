//61720435
public class Prob18 {
	public static void main(String[] args) {
		int i=1;
		for(i=1;i<=40;i++) {
			if(i%3==0) {
				if(i%4==0) {
					System.out.println(i+" TripleTater");
				}else {
					System.out.println(i+" Triple");
				}
			}else if(i%4==0) {
				System.out.println(i+" Tater");
			}else {
				System.out.println(i);
			}
		}
	}
}
