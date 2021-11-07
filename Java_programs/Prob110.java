//61720435
public class Prob110 {
	public static void main(String[] args){
		int NUM=190412,i=1,j=0,k=0;
		while(NUM>i) {
			i*=10;
		}
		int number=NUM;
		for(;i>=1;i/=10) {
			k=number/i;
			j+=k;
			number-=k*i;
		}
		if(NUM%j==0){
			System.out.println(NUM+"はHarshad数");
		}else {
			System.out.println(NUM+"はHarshad数でない");
		}
	}
}
