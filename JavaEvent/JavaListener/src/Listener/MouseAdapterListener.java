package Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterListener extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseAdapterListener() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30); // label�� ��ġ
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			la.setLocation(x, y);
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterListener();
	}
}