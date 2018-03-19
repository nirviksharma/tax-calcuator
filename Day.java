import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Day{
	/*
	private Scanner in = new Scanner(System.in); //clock in time
	private Scanner out = new Scanner(System.in); //clock out time
	private Scanner wage = new Scanner(System.in); //hourly wage
	private Scanner income = new Scanner(System.in); //yearly income  
	*/
	private JFrame day = new JFrame();
	private JPanel controlPanel = new JPanel();
	private JLabel w = new JLabel("calculate with hourly wage", JLabel);
	private JLabel i = new JLabel("calculate with yearly income", JLabel);
	private JButton wage = new JButton("wage", JButton.CENTER); //button to choose whether or not to use hourly wage	
	private JButton income = new JButton("income", JButton.CENTER); //or yearly income
	private JTextField hourlyWage = new JTextField(); //textbox 
	private JTextField yearlyIncome = new JTextField();

	public void setup(){
		day = new JFrame("Day");
		day.setVisible(true);
		day.setSize(500,500);
		day.add(controlPanel);
		day.add.setVisible(true);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
}
	public void window(){
		controlPanel.add(wage);
		controlPanel.add(userText);
		controlPanel.add(income);
		controlPanel.add(userText);

	}

	public void button(){
		wage.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent a){
				add.hourlyWage();
			}
		});
	}
}
