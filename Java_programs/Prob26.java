//61720435
public class Prob26 {
	public static void main(String[] args) {
		MyPoint p;
		p = new MyPoint();
		p.x=20;
		p.y=19;
		double pD=p.getDistance();
		System.out.println("点Pの原点からの距離は"+pD+"です");
		MyPoint q;
		q = new MyPoint();
		q.x=4;
		q.y=19;
		double qD=q.getDistance();
		System.out.println("点Qの原点からの距離は"+qD+"です");
	}
}
