package com.sd.gui;

import javax.swing.*;
import java.awt.*;
// import javax.swing.JFrame;
// import javax.swing.JButton;
// import java.awt.Container;

public class CalcAreaGUIMain {
	public static void main(String[] args) {
		JFrame f= new JFrame();
		JPanel panel = new JPanel(new GridLayout(3,2)); //JPanel is not window as itself.
		f.getContentPane().add(panel);
		JLabel label1 = new JLabel("Radius");
		JLabel label2 = new JLabel("Area");
		JTextField radiusTf1= new JTextField(10);
		JTextField areaTf2= new JTextField(10);
		JButton b1 = new JButton("Compute");
		JButton b2 = new JButton("Cancel");
		panel.add(label1);
		panel.add(radiusTf1);
		panel.add(label2);
		panel.add(areaTf2);
		panel.add(b1);
		panel.add(b2);
		f.pack();
		f.setVisible(true);
	}
}
// public class SimpleGUI {
// 	public void sayHello() {
// 		JFrame frame = new JFrame();
// 		JButton button = new JButton("myButton");
// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		Container pane = frame.getContentPane();
// 		pane.add(button);
// 		frame.setSize(100,100);
// 		frame.setVisible(true);
// 	}
// }