//61720435
import java.io.*;
import java.util.Scanner;

public class JKgame extends CPU{
	public void rule() {
		try {
			File file = new File("Rule.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String st;
			while (null != (st = br.readLine())) {
				System.out.println(st);
			}
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("ルールが書かれたファイルが見つかりませんでした。");
			System.out.println();
		}catch(IOException e) {
			System.out.println(e+e.toString());
			System.out.println();
		}
	}
	public void game() {
		CPU cpu = new CPU();
		int point=0,gpoint=0;
		String n2;
		System.out.println("何ポイント先取のゲームにするか、整数値で入力してください。");
		System.out.println("（おすすめ：20）");
		while(true) {
			Scanner scan1 = new Scanner(System.in);
			try {
	        	point = scan1.nextInt();
	        	if(point<=0) {
	        		System.out.println("0より大きい数を入力してください");
	        	}else {
	        		break;
	        	}
	        } catch (Exception e) {
	        	System.out.println("整数値を入力してください");
	        }
		}
		System.out.println(point+"ポイント先取で、ゲームスタートです！");
		System.out.println();
		while(true) {
			if(gpoint>=point) {
				System.out.println("おめでとうございます！");
				System.out.println("プレイヤーの勝利です！");
				break;
			}
			if(cpu.point>=point) {
				System.out.println("残念！");
				System.out.println("CPUの勝利です！");
				break;
			}
			System.out.println("出す手をコマンドで入力してください");
			System.out.println("グー　：g");
			System.out.println("チョキ：t");
			System.out.println("パー　：p");
			Scanner scan2 = new Scanner(System.in);
			n2=scan2.nextLine();
			cpu.JK();
			gpoint+=cpu.judge(n2);
			System.out.println("プレイヤー："+gpoint+"ポイント");
			System.out.println("CPU："+cpu.point+"ポイント");
			System.out.println();
		}
		System.out.println("CPUの出す手の割合は");
		System.out.println("グー　："+cpu.G+"%");
		System.out.println("チョキ："+cpu.T+"%");
		System.out.println("パー　："+cpu.P+"%");
		System.out.println("でした！");
		System.out.println();
	}
	public static void main(String[] args) {
		while(true) {
			JKgame jkgame = new JKgame();
			System.out.println("いずれかのコマンドを入力してください");
			System.out.println("ルール説明：r");
			System.out.println("ゲームスタート：s");
			System.out.println("プログラム終了：e");
			Scanner scan = new Scanner(System.in);
			String in = scan.nextLine();
			switch(in) {
			case "r":
				jkgame.rule();
				break;
			case "s":
				jkgame.game();
				break;
			case "e":
				System.out.println("プログラムを終了しました");
				System.exit(0);
				break;
			default:
				System.out.println("正しいコマンドを入力してください");
				System.out.println();
				break;
				}
			}
		}
	}
