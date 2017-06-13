import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;


public class Calculator extends JFrame implements ActionListener{
	private JTextField inputArea;
	private JTextField outputArea;
	
	private int currentNumber=0;
	private int enteredNumber=0;
	
	private JButton plus;
	private JButton minus;
	private JButton multiple;
	private JButton divisor;
	
	private JLabel label1;
	private JLabel label2;
	
	public Calculator(){
		super("Calculator");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		label1=new JLabel("result: ");
		add(label1);
		outputArea=new JTextField(10);
		add(outputArea);
		outputArea.setText("0");
		label2= new JLabel("input");
		add(label2);
		inputArea=new JTextField(10);
		inputArea.addActionListener(this);
		add(inputArea);
		
		plus=new JButton();
		minus=new JButton();
		multiple=new JButton();
		divisor=new JButton();
		
		plus.setText("+");
		add(plus);
		plus.addActionListener(this);;	
		minus.setText("-");
		add(minus);
		minus.addActionListener(this);
		multiple.setText("*");
		add(multiple);
		multiple.addActionListener(this);
		divisor.setText("/");	
		add(divisor);
		divisor.addActionListener(this);
		
		
		
		
	}
	
	private void calculateNumbers(char operation){	
		enteredNumber=Integer.parseInt(inputArea.getText());
		switch(operation){
		case '+': currentNumber+=enteredNumber;
		break;
		case '-': currentNumber-=enteredNumber;
		break;
		case'*': currentNumber*=enteredNumber;
		break;
		case'/': currentNumber/=enteredNumber;
		break;
		default:
			break;
		}
		String outputString=currentNumber+"";
		outputArea.setText(outputString);
		inputArea.setText("");
	}
	public void actionPerformed(ActionEvent e){
		char operation;
		operation=e.getActionCommand().charAt(0);
		calculateNumbers(operation);
	}
	public static void main(String[] args){
		Calculator aCalculator=new Calculator();
		aCalculator.setVisible(true);
	}

}
