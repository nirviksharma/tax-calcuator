
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class taxes1 extends JFrame implements ActionListener {
	public static void main(String[] args){
		
		//setting variables 
		int w = 200; // sets button width
		int h = 150; //sets button height 
		int fw = 500; // set button frame width 
		int fh = 650; //sets frame height
		int xpos = fw-300; //sets button x postion  
		int ypos = fh-400; // sets button y postion
		JLabel textTest;
		//Sets up Buttons
		JButton b1 = new JButton("Click me plz"); // makes button and sets text in button
		b1.setBounds(xpos,ypos,w,h); //calles all button vars and uses them
		

		//Sets up main frame
		JFrame mf = new JFrame();			//creats frame	
		mf.setLayout (new GridLayout(4,1));
		mf.setSize(new Dimension(fw,fh));	// sets frame size	
		mf.setLocationRelativeTo(null);		// sets location 
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //frame exits on close
		mf.setTitle("Tax APP");	  // sets frame tititle 
		mf.setVisible(true);     // makes frame visable 
		mf.setResizable(false);  //makes it so you cant resize frame
		mf.add(b1);		// adds button to frame

		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){

			if(event.getActionCommand().equals("Click me plz"))
			{
			SecondFrame sf = new SecondFrame();
			sf.setLayout (new GridLayout(4,1));
			sf.setSize(new Dimension(fw,fh));	
			sf.setLocationRelativeTo(null);		
			sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			sf.setTitle("Not A Tax APP");
			sf.setVisible(true);   
			sf.setResizable(false);  

			}
		}

		});

		


	}
}