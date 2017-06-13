package com;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Laboratory10ToChange  extends JFrame implements ActionListener{
	JLabel prompt, outputPrompt;
	JTextField inputArea, outputArea;
	JButton myButton;
	MyObject obj;
	public Laboratory10ToChange(){
		  super (" Laboratory 10 - EXCEPTIONS");
		  setLayout(new FlowLayout());
		  prompt = new JLabel ("Enter an Integer and Press CR");
		  add(prompt);
		  inputArea = new JTextField(15);
		  inputArea.addActionListener(this);
		  add(inputArea);
		  myButton = new JButton("Calculate Average");
		  myButton.addActionListener(this);
		  add(myButton);
		  outputPrompt = new JLabel ("The Average of the Numbers is");
		  add(outputPrompt);
		  outputArea = new JTextField(15);
		  add(outputArea);
		  obj = new MyObject();
		  setSize(250, 350);
		  setVisible(true);   
	}
	public void actionPerformed( ActionEvent e ){
		if (e.getSource() == inputArea){
			try{
				obj.insert(Integer.parseInt(e.getActionCommand()));
			}catch(NumberFormatException bfe){
				System.out.println("e: " + bfe);
			}
			inputArea.setText("");
		}
		if (e.getSource() == myButton){
			try{
				double average = obj.calcAverage();
				outputArea.setText(Double.toString(average));
			}catch(DivideByZeroException dbze){
				System.out.println("e: " + dbze);
			}

		}
	}
	
	public static void main( String args[] ){
		Laboratory10ToChange lab = new Laboratory10ToChange();
	}

}
