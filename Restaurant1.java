/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ackage restaurantbillingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

 
public class Restaurant1 extends Frame {
    
    
        private JFrame jframe;
        

          public  Restaurant1(){}
          
          public void show2(){
          
          
	
		this.setVisible(true);
		this.setSize (600,600);
		this.setLocation (200,100);
		this.setLayout(new FlowLayout());
		//Frame f = new Frame();
		
		Label l1 = new Label ("Wellcome To Your Billing Management System");
		Label l2 = new Label ("Please Login To Continue.");
		
		
		Button b1 = new Button ("Billing");
		Button b2 = new Button ("Manage Product");
		Button b3 = new Button ("View Order History");
		
		this.add(l1);
		this.add(l2);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
               /* b1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
						Restaurant re = new Restaurant();
                       re.Constructor();
                    }
                });
				*/
                
	}
          
          public void Constructors(){
          
               this.addWindowListener(new WindowAdapter() {
                     @Override
                   public void windowClosing(WindowEvent e){
                       System.exit(0);
                   }
});
          
          }


	public static void main (String args [])
	{
		Restaurant1 jav=new Restaurant1();
                jav.show2();
                jav.Constructors();
				//jav.setVisible(true);
               //k.windowClosing(a);
	}
    
    
}
