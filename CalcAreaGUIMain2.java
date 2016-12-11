package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
// import javax.swing.JFrame;
// import javax.swing.JButton;
// import java.awt.Container;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
	JTextField radiusTf1;
	JTextField areaTf2;
	JButton b1 = new JButton("Compute");
	JButton b2 = new JButton("Cancel");
	public CalcAreaGUIMain2() {
		// JFrame f= new JFrame();
		JPanel panel = new JPanel(new GridLayout(3,2)); //JPanel is not window as itself.
		getContentPane().add(panel);
		JLabel label1 = new JLabel("Radius");
		JLabel label2 = new JLabel("Area");
		radiusTf1= new JTextField(10);
		areaTf2= new JTextField(10);
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(label1);
		panel.add(radiusTf1);
		panel.add(label2);
		panel.add(areaTf2);
		panel.add(b1);
		panel.add(b2);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			b1.setText("complite.");
			b2.setText("cancel..");
			Double r = Double.parseDouble(radiusTf1.getText());
			areaTf2.setText(Double.toString(r*r*Math.PI));
		}
	    else {
	    	b2.setText("cancel...");
	    	b1.setText("compute..");
	    	radiusTf1.setText("");
	    	areaTf2.setText("");
	    }

	}
	public static void main(String[] args){
		CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
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