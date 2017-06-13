package com;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TicTacToeVision2 extends JFrame {
	private int turn;
	private int rowNumber, columnNumber;
	int xTable[] = { 46, 79, 113 };
	int yTable[] = { 113, 146, 180 };
	private boolean ifTheMoveIsValid = false;
	private char charactorToShow[][] = new char[3][3];

	public TicTacToeVision2() {
		super("Tictactoe Board");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				charactorToShow[i][j] = ' ';
			}
		}
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int xWherePressed, yWherePressed;
				xWherePressed = e.getX();
				yWherePressed = e.getY();
				checkPosition(xWherePressed, yWherePressed);
				repaint();
			}
						
			public void mouseReleased(MouseEvent e) {
				savePosition();
				repaint();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				int xWhereDragged, yWhereDragged;
				xWhereDragged = e.getX();
				yWhereDragged = e.getY();
				checkPosition(xWhereDragged, yWhereDragged);
				repaint();
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	private void savePosition() {
		if (ifTheMoveIsValid) {
			if (turn == 1) {
				charactorToShow[rowNumber][columnNumber] = 'X';
				turn = 2;
			} else {
				charactorToShow[rowNumber][columnNumber] = 'O';
				turn = 1;
			}
			ifTheMoveIsValid = false;
		}
	}

	public void paint(Graphics g) {
		int red = 255, green = 0, blue = 0;
		Font my_font;
		my_font = new Font("Serif", Font.BOLD, 18);
		super.paint(g);
		g.setColor(new Color(red, green, blue));
		g.drawLine(40, 140, 140, 140);
		g.drawLine(40, 173, 140, 173);
		g.drawLine(73, 107, 73, 207);
		g.drawLine(107, 107, 107, 207);
		g.setColor(new Color(0, 0, 0));
		g.fillRect(20, 87, 140, 5);
		g.fillRect(20, 87, 5, 140);
		g.fillRect(20, 222, 140, 5);
		g.fillRect(155, 87, 5, 140);
		g.setColor(Color.blue);
		g.setFont(my_font);
		g.drawString("My Tic Tac Toe Board", 30, 280);
		displayMoves(g);

	}

	private void displayMoves(Graphics g) {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				if (charactorToShow[i][j] == 'X') {
					drawX(g, i, j);
				} else if (charactorToShow[i][j] == 'O') {
					drawCircle(g, i, j);
				}
			}

		if (ifTheMoveIsValid) {
			if (turn == 1) {
				drawX(g, rowNumber, columnNumber);
			} else {
				drawCircle(g, rowNumber, columnNumber);
			}
		}
	}

	public void drawX(Graphics g, int rowNo, int columnNo) {

		g.drawLine(xTable[columnNo], yTable[rowNo], xTable[columnNo] + 10,
				yTable[rowNo] + 20);
		g.drawLine(xTable[columnNo], yTable[rowNo] + 20, xTable[columnNo] + 10,
				yTable[rowNo]);
	}

	private void drawCircle(Graphics g, int rowNo, int columnNo) {
		g.drawOval(xTable[columnNo], yTable[rowNo], 20, 20);
	}

	private void checkPosition(int x, int y) {
		if ((x < 40) || (x > 140) || (y < 73) || (y > 207))
			System.out.println(" error");
		else {
			if (x < 73)
				columnNumber = 0;
			else if (x < 107)
				columnNumber = 1;
			else
				columnNumber = 2;
			if (y < 140)
				rowNumber = 0;
			else if (y < 173)
				rowNumber = 1;
			else
				rowNumber = 2;
			if (charactorToShow[rowNumber][columnNumber] == ' ') {
				ifTheMoveIsValid = true;
			} 
			else {
				ifTheMoveIsValid = false;
			}
		}
	}

	public static void main(String args[]) {
		TicTacToeVision2 newBoard;
		newBoard = new TicTacToeVision2();
	}
}
