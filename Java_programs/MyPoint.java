//61720435
public class MyPoint {
	private int x;
	private int y;

	void setPoint(int xpos, int ypos) {
		x = xpos;
		y = ypos;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	double getDistance() {
		return Math.sqrt(x*x + y*y);
	}
	
	double getDistanceFrom(MyPoint m) {
		return Math.sqrt((x-m.x)*(x-m.x)+(y-m.y)*(y-m.y));
	}
}
