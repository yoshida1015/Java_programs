//61720435
import java.util.*;

public class Prob81 {
	public int result=0;
	public ArrayList<Integer> b=new ArrayList<Integer>();
	private void processInput(String inString) {
		String[] inputs = inString.split("\\s+");
		int i;
		for (i=0; i<inputs.length; i++) {
			if (inputs[i].compareTo("quit") == 0) {
				System.exit(0);
			}
			if(inputs[i].equals("finish")) {
				for(int j=0;j<b.size();j++)
					{
					result+=b.get(j);
					}
				System.out.println(result);
				for(int j=0;j<b.size();j++)
					{
					b.set(j,0);
					}
				result=0;
				continue;
			}
			b.add(Integer.valueOf(inputs[i]));
		}
	}
	
	public static void main(String[] args) {
		Prob81 app = new Prob81();

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Please input numbers: ");
			String str = scan.nextLine();
			app.processInput(str);
		}
	}
}
