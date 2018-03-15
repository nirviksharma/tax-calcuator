import java.util.*;
import java.awt.*;
import java.swing.*;

public class Day{
	private Scanner in = new Scanner(System.in); //clock in time
	private Scanner out = new Scanner(System.in); //clock out time
	private Scanner wage = new Scanner(System.in); //hourly wage
	private Scanner income = new Scanner(System.in); //yearly income
	private JFrame day = new JFrame();
	private JLabel header = new JLabel("Day", JLabel.CENTER); //label window as day
	private JButton wage = new JButton("wage", JButton.CENTER); //button to choose whether or not to use hourly wage	
	private JButton income = new JButton("income", JButton.CENTER); //or yearly income
	private JTextField hourlyWage = new JTextField(); //textbox 
	private JTextField yearlyIncome = new JTextField();

	public static void main(String[] args){
		
		day.setVisible(true);
		day.setSize(500,500);

		controlPanel.add(wage);
		controlPanel.add(income);

		println("what was your clock in time in military time?");
		int in = in.nextInt();

		println("what was your clock out time in military time?");
		int out = out.nextInt();

	}

	public void Button(){
		wage.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent a){
				add.hourlyWage();
			}
		});
	}
}
