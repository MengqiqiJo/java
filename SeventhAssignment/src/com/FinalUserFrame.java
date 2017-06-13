package com;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FinalUserFrame extends JFrame implements ActionListener {
	private JTextField inputArea;
	private JTextArea outputArea;

	private JLabel label1;

	private JButton unsortedStudents;
	private JButton descendingStudents;
	private JButton ascendingStudents;

	private University aUniversity;
	private OutputFrame sortedListStudents;

	public FinalUserFrame(University theUniversity) {
		super("input frame");
		setSize(500, 900);
		aUniversity = theUniversity;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		label1 = new JLabel("enter name of country");
		add(label1);

		inputArea = new JTextField(15);
		add(inputArea);
		inputArea.addActionListener(this);

		outputArea = new JTextArea(25, 45);
		add(outputArea);

		unsortedStudents = new JButton("show students");
		unsortedStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.setText(aUniversity.toString());
			}
		});
		add(unsortedStudents);

		ascendingStudents = new JButton("show students sorted ascending");
		ascendingStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sort.setSortingFalg(false);
				aUniversity.sortStudents();
				sortedListStudents = new OutputFrame(
						"sorted list (ascending) of students");
				sortedListStudents.displayMessage(aUniversity
						.toString());
			}
		});
		add(ascendingStudents);

		descendingStudents = new JButton("show students sorted descending");

		descendingStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	Sort.setSortingFlag(true);
				Sort.setSortingFalg(true);
				aUniversity.sortStudents();
				sortedListStudents = new OutputFrame(
						"sorted list (descendingStudents) of students");
				sortedListStudents.displayMessage(aUniversity
						.toString());
			}
		});
		add(descendingStudents);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String inputCountryName;
		String output;
		inputCountryName = inputArea.getText();
		inputArea.setText("");
		output = "Number of students from" + inputCountryName + "is"
				+ aUniversity.numberOfStudents(inputCountryName);
		outputArea.setText(output);
	}
}
