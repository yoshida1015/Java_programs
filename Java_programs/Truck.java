//61720435
public class Truck extends Car{
	private Goods[] cargo;
	private int count=0;
	public Truck(int max){
		super();
		cargo=new Goods[max];
		
	}
	public void addGoods(Goods n) {
		if(count==0) {
			cargo[0]=n;
			count++;
			return;
		}
		int i=0;
		for(i=0;i<count;i++) {
			if(cargo[i].getType().equals(n.getType()) &&
					cargo[i].getUnitPrice()==n.getUnitPrice() &&
					cargo[i].getDestination().equals(n.getDestination())) {
				cargo[i].setNum(cargo[i].getNum()+n.getNum());
				return;
			}
		}
		cargo[count]=n;
		count++;
		return;
	}
	public int totalCargoValue() {
		int i=0,total=0;
		for(i=0;i<count;i++) {
			total+=(cargo[i].getUnitPrice()*cargo[i].getNum());
		}
		return total;
	}
	public int getTotalCharge() {
		int i=0,total=0;
		for(i=0;i<count;i++) {
			total+=cargo[i].getCharge();
		}
		return total;
	}
	public void showStatus() {
		int i=0;
		for(i=0;i<count;i++) {
			System.out.println("type:"+cargo[i].getType()+", num:"+cargo[i].getNum()+", price:"+cargo[i].getUnitPrice()+", destination:"+cargo[i].getDestination());
		}
		System.out.println("Total Cargo Value:"+totalCargoValue());
		System.out.println("Get Cargo Value:"+getTotalCharge());
	}
}
