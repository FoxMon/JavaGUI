package javaproj;

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("640 x 480 스윙 프레임 만들기");
		setSize(640, 480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
