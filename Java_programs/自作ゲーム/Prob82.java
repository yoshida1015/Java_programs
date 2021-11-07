//61720435
import java.io.*;

public class Prob82 {
	public static void main(String[] args) {
		try {
			File file = new File("message.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			FileWriter wfile = new FileWriter("output82.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(wfile));
			String[] words;
			String st=null; 
			while (null != (st = br.readLine())) {
					words=st.split("\\s");
					pw.println(words.length+" "+st.length()+":"+st);
					if(st.endsWith(" ")) {
						pw.println("0 1:");
					}else {
						pw.println("0 0:");
					}
				}
			br.close();
			pw.close();
		}catch(IOException e){
			System.out.println(e+e.toString());
		}
	}
}
