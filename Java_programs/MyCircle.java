//61720435
public class MyCircle { 
	MyPoint center=new MyPoint(); 
	int radius; 
	void setCircle(int cx,int cy,int r){
		center.x=cx;
		center.y=cy;
		radius=r;
	} 
	int computeDiameter(){
		int d=2*radius;
		return d;
	}  
	double computeArea(){
		double m=radius*radius*Math.PI;
		return m;
	}  
	double computeCircumference(){
		double l=computeDiameter()*Math.PI;
		return l;
	}  
} 