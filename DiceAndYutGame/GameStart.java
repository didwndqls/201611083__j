package com.sd.DiceGame;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GameStart extends JFrame implements ActionListener{
	protected String a = null;
	protected String b = null;
	protected String c = null;
	JTextField playerName1;
	JTextField playerName2;
	JButton b1 = new JButton("Roll the Dice!");
	JButton b2 = new JButton("Throw the Yut");
	GTurtle gt1 = new GTurtle(-100.0,-200.0);
	GTurtle gt2 = new GTurtle(100.0,-200.0);
	FileRead f = new FileRead();
	public GameStart() {
		JPanel panel = new JPanel(new GridLayout(3,2));
		getContentPane().add(panel);
		JLabel label1 = new JLabel("Input Player 1 Name: ");
		JLabel label2 = new JLabel("Input player 2 Name: ");
		playerName1 = new JTextField(20);
		playerName2 = new JTextField(20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(label1);
		panel.add(playerName1);
		panel.add(label2);
		panel.add(playerName2);
		panel.add(b1);
		panel.add(b2);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			DiceGame g = new DiceGame();
			a = playerName1.getText();
			b = playerName2.getText();
		    c = g.startGame(a,b);
		}
		else {
			YutNoriGame y = new YutNoriGame(c);
			y.startGame();
			gt1.rColor();
			gt2.bColor();
			if (c.equals(a)){
				if(y.getNum()!=6){
					gt1.move(y.getNum());
					if(gt1.pos()>200){
						f.print();
						f.fWrite();
					}
				}
				else {
					gt1.backMove();
				}
			}
			else if (c.equals(b)){
				if(y.getNum()!=6){
					gt2.move(y.getNum());
					if(gt2.pos()>200) {
						f.print();
						f.fWrite();
					}
				}
				else {
					gt2.backMove();
				}
			}
		}
	}
	public static void main(String[] args) {
		GameStart g = new GameStart();
	}
}