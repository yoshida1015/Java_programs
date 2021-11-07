//61720435
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Prob94 {
	
   
   private int answer=0;
   private String ans;
   private int result=0;
   private JLabel label;
   private int f=0;

   class ButtonAction0 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=0;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(Integer.toString(result));
	    }
	  }
  class ButtonAction1 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	result*=10;
    	result+=1;
    	if(f==1) {
    		answer+=result;
    	}else if(f==2) {
    		answer-=result;
    	}else if(f==3) {
    		answer*=result;
    	}else if(f==4) {
    		answer/=result;
    	}else {
    		answer=result;
    	}
    	label.setText(Integer.toString(result));
    }
  }
  class ButtonAction2 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=2;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonAction3 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=3;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonAction4 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=4;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonAction5 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=5;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonAction6 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=6;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonAction7 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=7;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonAction8 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=8;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonAction9 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	result*=10;
	    	result+=9;
	    	if(f==1) {
	    		answer+=result;
	    	}else if(f==2) {
	    		answer-=result;
	    	}else if(f==3) {
	    		answer*=result;
	    	}else if(f==4) {
	    		answer/=result;
	    	}else {
	    		answer=result;
	    	}
	    	label.setText(String.valueOf(Integer.toString(result)));
	    }
	  }
  class ButtonActionp implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	f=1;
	    	result=0;
	    	label.setText(String.valueOf("+"));
	    }
	  }
  class ButtonActionm implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	f=2;
	    	result=0;
	    	label.setText(String.valueOf("-"));
	    }
	  }
  class ButtonActionk implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	f=3;
	    	result=0;
	    	label.setText(String.valueOf("*"));
	    }
	  }
  class ButtonActionw implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	f=4;
	    	result=0;
	    	label.setText(String.valueOf("/"));
	    }
	  }
  class ButtonActione implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	f=0;
	    	result=0;
	    	ans=Integer.toString(answer);
	    	label.setText(ans);
	    }
	  }
  class ButtonActionc implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	f=0;
	    	result=0;
	    	answer=0;
	    	label.setText(Integer.toString(result));
	    }
	  }

  public Component createComponents() {
	  
	 label = new JLabel();
	 JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton bp = new JButton("+");
    JButton bm = new JButton("-");
    JButton bk = new JButton("*");
    JButton bw = new JButton("/");
    JButton be = new JButton("=");
    JButton bc = new JButton("C");

    ButtonAction0 buttonListener0 = new ButtonAction0();
    b0.addActionListener( buttonListener0 );
    ButtonAction1 buttonListener1 = new ButtonAction1();
    b1.addActionListener( buttonListener1 );
    ButtonAction2 buttonListener2 = new ButtonAction2();
    b2.addActionListener( buttonListener2 );
    ButtonAction3 buttonListener3 = new ButtonAction3();
    b3.addActionListener( buttonListener3 );
    ButtonAction4 buttonListener4 = new ButtonAction4();
    b4.addActionListener( buttonListener4 );
    ButtonAction5 buttonListener5 = new ButtonAction5();
    b5.addActionListener( buttonListener5);
    ButtonAction6 buttonListener6 = new ButtonAction6();
    b6.addActionListener( buttonListener6);
    ButtonAction7 buttonListener7 = new ButtonAction7();
    b7.addActionListener( buttonListener7 );
    ButtonAction8 buttonListener8 = new ButtonAction8();
    b8.addActionListener( buttonListener8 );
    ButtonAction9 buttonListener9 = new ButtonAction9();
    b9.addActionListener( buttonListener9 );
    ButtonActionp buttonListenerp = new ButtonActionp();
    bp.addActionListener( buttonListenerp );
    ButtonActionm buttonListenerm = new ButtonActionm();
    bm.addActionListener( buttonListenerm );
    ButtonActionk buttonListenerk = new ButtonActionk();
    bk.addActionListener( buttonListenerk );
    ButtonActionw buttonListenerw = new ButtonActionw();
    bw.addActionListener( buttonListenerw );
    ButtonActione buttonListenere = new ButtonActione();
    be.addActionListener( buttonListenere );
    ButtonActionc buttonListenerc = new ButtonActionc();
    bc.addActionListener( buttonListenerc );
    

    JPanel pane = new JPanel();
    pane.setLayout(new GridLayout(5,1));
    pane.setBorder(BorderFactory.createEmptyBorder( 150,150,150,150));
    pane.add(Box.createRigidArea(new Dimension(100,50)));
    pane.add(label);
    
    pane.add(Box.createRigidArea(new Dimension(20, 10)));
    pane.add(Box.createRigidArea(new Dimension(20, 10)));
    pane.add(Box.createRigidArea(new Dimension(20, 10)));
  
    pane.add(b7);
    pane.add(b8);
    pane.add(b9);
    pane.add(bc);
  
    pane.add(Box.createRigidArea(new Dimension(20,10)));
    pane.add(b4);
    pane.add(b5);
    pane.add(b6);
    pane.add(bk);
    pane.add(bw);
    pane.add(b1);
    pane.add(b2);
    pane.add(b3);
    pane.add(bp);
    pane.add(bm);
    pane.add(b0);
    pane.add(Box.createRigidArea(new Dimension(20,10)));
    pane.add(Box.createRigidArea(new Dimension(20,10)));
    
    pane.add(be);
   
    
   
    

    return pane;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Prob94");
    Prob94 app = new Prob94();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
