//61720435
public class Square {
	void draw(Turtle t, Vertex v) { 
		for(int i = 0; i < 4; i++) { 
			v.draw(t);
			t.penUp();
			t.go(100);
			t.rotate(90);
			} 
		}       
public static void main(String[] args) { 
              Square square=new Square(); 
              Turtle turtle=new Turtle(); 
              turtle.move(10,300);       
              square.draw(turtle,new TriVertex()); 
              turtle.move(150,250);       
              square.draw(turtle,new CrossVertex()); 
       }       
} 