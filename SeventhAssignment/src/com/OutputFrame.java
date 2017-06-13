package com;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class OutputFrame extends JFrame implements ActionListener {
	private JLabel outputmessage;
	private JTextArea outputArea;
	private JButton closeWindow;

	public OutputFrame(String aString) {
		super("output frame");
		setSize(600, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		outputmessage = new JLabel(aString);
		add(outputmessage);

		outputArea = new JTextArea(40, 40);
		add(outputArea);

		closeWindow = new JButton("close window");
		closeWindow.addActionListener(this);
		add(closeWindow);

		setVisible(true);
	}

	public void displayMessage(String stringtoDisplay) {
		outputArea.setText(stringtoDisplay);
	}

	public void actionPerformed(ActionEvent e) {
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}

}
