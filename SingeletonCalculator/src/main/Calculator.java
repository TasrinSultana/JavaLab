package main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {
	 private static volatile Calculator instance = null;
	 
	 public static Calculator getInstance() {
	        if (instance == null) {
	            synchronized (Calculator.class) {
	                // Double check
	                if (instance == null) {
	                    instance = new Calculator();
	                    System.out.println("Object Creating");
	                }
	            }
	        }
	        System.out.println("Object Reusing");
	        return instance;
	  }
	 
	JFrame frame;
	JTextField textField;
	JButton btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,
		btn_0,btn_add,btn_sub,btn_mul,btn_div,btn_equal,btn_point,
		btn_00,btn_AC,btn_C,btn_percent;
	
	public Calculator() {
		super();
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn_C = new JButton("C");
		btn_AC = new JButton("AC");
		btn_percent =new JButton("%");
		btn_00 = new JButton("00");
		btn_1 = new JButton("1");
		btn_2 = new JButton("2");
		btn_3 = new JButton("3");
		btn_4 = new JButton("4");
		btn_5 = new JButton("5");
		btn_6 = new JButton("6");
		btn_7 = new JButton("7");
		btn_8 = new JButton("8");
		btn_9 = new JButton("9");
		btn_0 = new JButton("0");
		btn_add = new JButton("+");
		btn_sub = new JButton("-");
		btn_mul = new JButton("*");
		btn_div = new JButton("/");
		btn_equal = new JButton("=");
		btn_point = new JButton(".");
		textField = new JTextField();
		
		
		GridBagConstraints cst = new GridBagConstraints();
		frame.setResizable(false);
		frame.setSize(400,400);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		frame.setLayout(new GridBagLayout());
		
		
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridwidth=4;
		cst.gridx=0;
		cst.gridy=0;
		cst.ipady=20;
		frame.add(textField,cst);
		//
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridwidth=1;
		cst.ipady=10;
		cst.ipadx=15;
		cst.gridx=0;
		cst.gridy=1;
		frame.add(btn_AC,cst);
		
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridwidth=1;
		cst.gridx=1;
		cst.gridy=1;
		frame.add(btn_C,cst);
		
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridwidth=1;
		cst.gridx=2;
		cst.gridy=1;
		frame.add(btn_percent,cst);
		
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=3;
		cst.gridy=1;
		frame.add(btn_div,cst);
		
		//first row
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridwidth=1;
		cst.gridx=0;
		cst.gridy=2;
		frame.add(btn_7,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=1;
		cst.gridy=2;
		frame.add(btn_8,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=2;
		cst.gridy=2;
		frame.add(btn_9,cst);
		
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=3;
		cst.gridy=2;
		frame.add(btn_mul,cst);
		
		//second row
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=0;
		cst.gridy=3;
		frame.add(btn_4,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=1;
		cst.gridy=3;
		frame.add(btn_5,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=2;
		cst.gridy=3;
		frame.add(btn_6,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=3;
		cst.gridy=3;
		frame.add(btn_sub,cst);
		
		//third row
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=0;
		cst.gridy=4;
		frame.add(btn_1,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=1;
		cst.gridy=4;
		frame.add(btn_2,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=2;
		cst.gridy=4;
		frame.add(btn_3,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=3;
		cst.gridy=4;
		frame.add(btn_add,cst);
		
		//fourth row
		
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=0;
		cst.gridy=5;
		frame.add(btn_00,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=1;
		cst.gridy=5;
		frame.add(btn_0,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=2;
		cst.gridy=5;
		frame.add(btn_point,cst);
		cst.fill =GridBagConstraints.HORIZONTAL;
		cst.gridx=3;
		cst.gridy=5;
		frame.add(btn_equal,cst);
		
		
		
		frame.setVisible(true);
		
	
	}


}