/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package restaurantbillingsystem;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;


 
public class Restaurant extends JFrame {
    
    
        private JFrame jframe;
        JLabel label1,label2,label3,label4;
        JTextField text1,text2;
        JButton login,cancel;
        JPanel panel;  //window declare

          public  Restaurant(){
          
         
          
          
	
	this.setSize(770, 420);
        this. setLayout(null);
        label1  = new   JLabel("Wellcome to Your billing management System");
        label1.setFont(new Font("Serif", Font.BOLD, 25));
       
        label1.setBounds(100, 50, 700, 30);
        this.add(label1);
        
        label2 = new JLabel("Please Login to Continue");
        label2.setFont(new Font("Serif",Font.PLAIN,20));
        label2.setBounds(220,100,700,30);
        this.add(label2);
        
        
        label3 = new JLabel("Username:");
        label3.setFont(new Font("Serif",Font.PLAIN,20));
        label3.setBounds(100,200,300,30);
        this.add(label3);
        
        text1 = new JTextField();
        text1.setBounds(190,200,300,30);
        this.add(text1);
        
        
        label4 = new JLabel("Password:");
        label4.setFont(new Font("Serif",Font.PLAIN,20));
        label4.setBounds(100,260,300,30);
        this.add(label4);
        
        text2 = new JTextField();
        text2.setBounds(190,260,300,30);
        this.add(text2);
        
        login = new JButton("Login"); 
        login.setFont(new Font("Serif",Font.BOLD,20));
        login.setBounds(190,310,100,40);
        this.add(login);
        
       
        login.addActionListener(new ActionListener() {
            
           

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                 RestaurantBillingSystem r = new RestaurantBillingSystem();
                 r.setVisible(true);
            }
        }); 
       
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      
          
          }
        //  Restaurant jav=new Restaurant();
         
         //lose();
          
          
          



	public static void main (String args [])
	{
		Restaurant jav=new Restaurant();
                //jav.close();
               
               //k.windowClosing(a);
	}
    
    
}

