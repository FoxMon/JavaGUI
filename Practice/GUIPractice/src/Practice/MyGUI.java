package Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MyGUI() {
		setTitle("Mouse event ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				la.setLocation(x, y);
			}
		});
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}