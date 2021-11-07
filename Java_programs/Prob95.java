//61720435
import java.util.*;
import java.io.*;

public class Prob95{
  public static void main(String[] args){
    try{
      File file = new File("message.txt");
      FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		FileWriter wfile = new FileWriter("output95.txt");
		PrintWriter pw = new PrintWriter(new BufferedWriter(wfile));
      ArrayList<String> wordList = new ArrayList<String>();
      String[] words=null;
      String st=null;
      while (null != (st = br.readLine())) {
					words=(st.split("\\s|,|\\."));
          for(int i=0;i<words.length;i++){
            words[i]=words[i].toLowerCase();
            wordList.add(words[i]);
          }
        }
        /*for(int i=0;i<wordList.size();i++){
          System.out.println(wordList.get(i));
        }*/
      ArrayList<String> stuck = new ArrayList<String>();
      int count;
      String[] w = new String[wordList.size()];
      int[] c = new int[wordList.size()];
      int t=0;
      for(int i=0;i<wordList.size();i++){
        if(stuck.contains(wordList.get(i))){
          continue;
        }
        count=1;
        for(int j=i+1;j<wordList.size();j++){
          if(wordList.get(i).equals(wordList.get(j))){
            count++;
          }
        }
        if(count>1){
          //System.out.println(wordList.get(i)+" "+count);
          c[t]=count;
          w[t]=wordList.get(i);
          t++;
        }
        stuck.add(wordList.get(i));
      }
      int max=0;
      for(int i=0;i<c.length;i++){
        if(max<c[i]){
          max=c[i];
        }
      }
      for(int i=max;i>1;i--){
        for(int j=0;j<c.length;j++){
          if(c[j]==i){
        	  pw.println(w[j]+" "+c[j]);
          }
        }
      }

	br.close();
	pw.close();
    }catch(IOException e){
      System.out.println(e+e.toString());
    }
  }
}
