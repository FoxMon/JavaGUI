package Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// ����Ʈ �ҿ� FlowLayout ��ġ ������ ����
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("Add"));
		c.add(new JButton("Sub"));
		c.add(new JButton("Mul"));
		c.add(new JButton("Div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}