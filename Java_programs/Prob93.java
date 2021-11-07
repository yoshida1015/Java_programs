//61720435
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Prob93 {
		private JTextField field;
		private static String labelPrefix = "New String: ";
		private String str;
		private JLabel label;

  class ButtonAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	String tempText = field.getText();
    	str=tempText;
      label.setText(labelPrefix + str);
    }
  }

  public Component createComponents() {
	  field = new JTextField();
	  label = new JLabel(labelPrefix);
    JButton button = new JButton("Move !");

    ButtonAction buttonListener = new ButtonAction();
    button.addActionListener( buttonListener );

    JPanel pane = new JPanel();
    pane.setLayout(new GridLayout(0, 1));
    pane.setBorder(BorderFactory.createEmptyBorder( 50, 50, 50, 50 ));
    pane.add(Box.createRigidArea(new Dimension(200, 10)));
    pane.add(field);
    pane.add(button);
    pane.add(label);
    

    return pane;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Prob93");
    Prob93 app = new Prob93();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
