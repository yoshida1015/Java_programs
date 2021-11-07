//61720435
public abstract class Goods {
	protected String type;
	protected int num;
	protected int price;
	protected String destination;
	public Goods(String a,int b,int c,String d){
		type=a;
		num=b;
		price=c;
		destination=d;
	}
	public String getType(){
		return type;
	}
	public int getNum() {
		return num;
	}
	public int getUnitPrice() {
		return price;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String d) {
		destination=d;
	}
	public void setNum(int n) {
		num=n;
	}
	public int getTotalPrice() {
		return price*num;
	}
	public void print() {
		System.out.println("type:"+type+", num:"+num+", price:"+price+", destination"+destination);
	}
	abstract int getCharge();
}


