package cpt10;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import java.awt.EventQueue;

import javax.swing.JFrame;

public class timer {

	private JFrame frame;





Public int inc = 0 ;



 ActionListener taskPerformer = new ActionListener() {
			            public void actionPerformed(ActionEvent evt) {
			            	
			            	
			            	
			            	inc = inc +1; 
			            	
			            	switch (inc) {
			            	case 1: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/BarEmpty.png"));
			            		loadBarPer.setText("0%");
			            		break;
			            	case 2: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar1.png"));
			            		loadBarPer.setText("9%");
			            		break;
			            	case 3: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar2.png"));
			            		loadBarPer.setText("30%");
			            		break;
			            	case 4: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar3.png"));
			            		loadBarPer.setText("47%");
			            		break;
			            	case 5: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar4.png"));
			            		loadBarPer.setText("69%");
			            		break;
			            	case 6: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar5.png"));
			            		loadBarPer.setText("95%");
			            		break;
			            	case 7: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar6.png"));
			            		Keep1.setText("the file has been deleted");
			            		loadBarPer.setText("100%");
			            		break;
			       
			            	}
			            	
			            	
			            	
			            	
			            }
			        };
			        Timer timer = new Timer(1250 ,taskPerformer);
			        timer.setRepeats(true);
			        timer.start();

