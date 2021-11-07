//61720435
import java.util.Random;

public class CPU {
	public int G,T,P;
	public String jk;
	public int point=0;
	public Random random=new Random();
	public CPU(){
		G = random.nextInt(100);
		T = random.nextInt(100-G);
		P = 100-(G+T);
	}
	public void JK() {
		int num;
		num = random.nextInt(100);
		if(0<=num && num<G) {
			jk="g";
		}else if(G<=num && num<(G+T)) {
			jk="t";
		}else {
			jk="p";
		}
	}
	public int judge(String pjk) {
		if(pjk.equals(jk)) {
			System.out.println("あいこ！");
			return 0;
		}else if(pjk.equals("g") && jk.equals("t")) {
			System.out.println("プレイヤーがグーで勝ち！");
			return 3;
		}else if(pjk.equals("t") && jk.equals("g")) {
			System.out.println("CPUがグーで勝ち！");
			point+=3;
			return 0;
		}else if(pjk.equals("t") && jk.equals("p")) {
			System.out.println("プレイヤーがチョキで勝ち！");
			return 6;
		}else if(pjk.equals("p") && jk.equals("t")) {
			System.out.println("CPUがチョキで勝ち！");
			point+=6;
			return 0;
		}else if(pjk.equals("p") && jk.equals("g")) {
			System.out.println("プレイヤーがパーで勝ち！");
			return 6;
		}else if(pjk.equals("g") && jk.equals("p")) {
			System.out.println("CPUがパーで勝ち！");
			point+=6;
			return 0;
		}else {
			System.out.println("正しいコマンドを入力してください");
			return 0;
		}
	}
}
