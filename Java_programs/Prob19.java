//61720435
public class Prob19 {
	public static void main(String[] args){
		int NUM=214091,i=1,j=1;
		for(i=1;i<=NUM/2;i++){
			if(NUM%i==0) {
				j=i;
			}
		}
		if(NUM<=0) {
			System.out.println(NUM+"は0以下の数");
		}else if(NUM==1){
			System.out.println(NUM+"は素数ではない");
		}else if(j==1){
			System.out.println(NUM+"は素数");
		}else {
			System.out.println(NUM+"の自身以外の最大の約数は"+j);
		}
	}
}
