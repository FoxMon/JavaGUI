package javaproj;

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("640 x 480 ���� ������ �����");
		setSize(640, 480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}