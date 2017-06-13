package com;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MoveCircle  extends JFrame{
	Coordinate center;
	Coordinate lastMousePosition;
	//int radius;
	int length=50;
	int width=40;
	Color circleColor; 
	boolean circleIsSelected = false; 
	boolean widthSelected = false;
	boolean lengthSelected = false;
	boolean perimeterSelected=false;
	public MoveCircle(){
		super("showing circle");
		center = new Coordinate(100, 100);
		
		circleColor = Color.RED;
		
		addMouseListener( new MouseAdapter(){
			public void mousePressed(MouseEvent e ){
				int xValue, yValue;
				xValue = e.getX();
				yValue = e.getY();
				circleIsSelected = false;
				widthSelected = false;
				lengthSelected=false;
				lastMousePosition = new Coordinate(xValue, yValue);
				if (circleIsSelected(lastMousePosition)){ 
					circleIsSelected = true;              
					circleColor = Color.GREEN;           
				}
				else if (onPerimeter(lastMousePosition)){ 
					perimeterSelected = true;             
					circleColor = Color.BLUE;            
				}
				repaint();
			}
			public void mouseReleased(MouseEvent e ){ 
				circleColor = Color.RED;               
				circleIsSelected = false;            
				perimeterSelected = false;
				repaint();
			}
		}
		);
		
		addMouseMotionListener( new MouseMotionAdapter(){
			public void mouseDragged( MouseEvent e ){ 
				int xValue, yValue;
				Coordinate newMousePosition;
				if (circleIsSelected || perimeterSelected){  
					xValue = e.getX();                      
					yValue = e.getY();                      
					newMousePosition = new Coordinate(xValue, yValue); 
					if (circleIsSelected){
						updateCirclePosition(newMousePosition); 
					} else{
						if(widthSelected){
						updateRecSizeByWidth(newMousePosition); 
						}{
						updateRecSizeByLength(newMousePosition); 
						}
					}
					repaint();
				}
			}
		}
		);
		setSize(275,300);
		setVisible(true);
	}
	
	private void updateCirclePosition(Coordinate newMousePosition){
		int newXValue, newYValue; 
		newXValue = center.getX() + newMousePosition.getX() - lastMousePosition.getX();
		newYValue = center.getY() + newMousePosition.getY() - lastMousePosition.getY();
		center = new Coordinate(newXValue, newYValue);
		lastMousePosition = newMousePosition;
	}
	
	private void updateRecSizeByWidth(Coordinate newMousePosition){
		int newXValue, newYValue;
		newXValue = newMousePosition.getX();
		//newYValue = newMousePosition.getY();
		width=newXValue-center.getX()-width/2;
	}
	private void updateRecSizeByLength(Coordinate newMousePosition){
		int newXValue, newYValue;
		//newXValue = newMousePosition.getX();
		newYValue = newMousePosition.getY();
		length=newYValue-center.getY()-length/2;
	}

	private boolean  circleIsSelected(Coordinate point){
		double distanceFromCenter;
		distanceFromCenter = center.distance(point);
		if ((distanceFromCenter < length - 5)||(distanceFromCenter < width - 5)) {
			return true; 
		}
		else {
			return false;
		}
	} 


	private boolean onPerimeter(Coordinate point){
		double distanceFromCenter;
		distanceFromCenter = center.distance(point);
		if ((distanceFromCenter >= length - 5) && 
				(distanceFromCenter <= length + 5)&&(distanceFromCenter >= width - 5)&&(distanceFromCenter >= width+ 5)) {
			return true;
		} else{
			return false;
		}
	}

	private void showCircle(Graphics g){	
		g.setColor(circleColor);	
		g.drawRect(center.getX()-width/2, center.getY()-length/2, width, length);
		
	}

	public void paint(Graphics g){
		
		super.paint(g);  
		showCircle(g);
		
	}
	public static void main(String args[]){ 
		MoveCircle myFrame;
		myFrame = new MoveCircle();
	}   
}



