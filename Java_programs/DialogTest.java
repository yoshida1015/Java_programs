//61720435
public  class  DialogTest  {  
	public static void main(String[] args) {
		String text=javax.swing.JOptionPane.showInputDialog(null);
		if(text.equals("beef")||text.equals("pork"))
			System.out.println("meat");
		else if(text.equals("lettuce")||text.equals("cucumber"))
			System.out.println("vegetable");
		else if(text.equals("orange")||text.equals("apple"))
			System.out.println("fruit");
		else
			System.out.println("Unknown");
		}
}         