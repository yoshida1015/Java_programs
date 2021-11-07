//61720435
import java.io.*;
import java.util.*;

public class Prob83 {
	public static void main(String[] args) {
		try {
			File file = new File("message.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			FileWriter wfile = new FileWriter("output83.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(wfile));
			String st=null; 
			int i=0;
			while (null != (st = br.readLine())) {
				ArrayList<Character> data=new ArrayList<Character>();
				for(i=0;i<st.length();i++) {
					data.add(st.charAt(i));
				}
				int num=data.size()-1;
				for(i=num;i>=0;i--) {
					pw.print(data.get(i));
				}
				pw.println("");
			}
			br.close();
			pw.close();
		}catch(IOException e){
			System.out.println(e+e.toString());
		}
	}
}
