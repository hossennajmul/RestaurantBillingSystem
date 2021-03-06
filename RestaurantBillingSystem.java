
//package restaurantbillingsystem;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RestaurantBillingSystem extends JFrame {
    
    JLabel label1,label2,label3,label4,label5;
    JTextField text1;
    JPasswordField text2;
    JButton login,cancel;
    JPanel panel;  //window declare

    public RestaurantBillingSystem(){
        
        this.setSize(1000, 1000);
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
        
        text2 = new JPasswordField();
        text2.setBounds(190,260,300,30);
        this.add(text2);
        
        login = new JButton("Login"); 
        login.setFont(new Font("Serif",Font.BOLD,20));
        login.setBounds(190,310,100,40);
        this.add(login);
        
        label5 = new JLabel(); 
        label5.setFont(new Font("Serif",Font.BOLD,20));
        label5.setForeground(Color.red);
        label5.setBounds(190,380,300,20);
        this.add(label5);
        
        
        login.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
              
              /*  try{
                DataAccess da = new DataAccess();
                
                String username = text1.getText().toString();
                String password = text2.getText().toString();
                
                ResultSet rs=null;
                String q="select * from user where username='"+username+"' && password='"+password+"'";
                rs=da.getData(q);
		//String nm="abc";
                 if(rs.next()==true){
                      
                       Restaurant r = new Restaurant();
                        r.setVisible(true);
                        setVisible(false);
                 }
                        
                        else{
                               label5.setText("Username & password not matched");
                             }
                       
        
        da.close();}
                catch(Exception ex){
                    ex.printStackTrace();
                }
        
        /*String q="insert into mytable values(5,'another','raj')";
        int c=da.updateDB(q);
        da.close();*/
		
		
		/*int id=2;
        String q="delete from mytable where id="+id;
        System.out.println(q);
		int c=da.updateDB(q);
		*/
		
      /*  String q="update mytable set name='bob5' where id=5";
        int c=da.updateDB(q);
        da.close();  */
        //System.out.println(rs.toString()); */
                
                Restaurant r = new Restaurant();
                        r.setVisible(true);
                        setVisible(false);
                
               
                
            }
        });
       
        cancel = new JButton("Exit");
        cancel.setFont(new Font("Serif",Font.BOLD,20));
        cancel.setBounds(390,310,100,40);
        this.add(cancel);
        
        
        cancel.addActionListener(e->System.exit(0));           
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
       
        
    

    }
      
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       RestaurantBillingSystem rbm  = new RestaurantBillingSystem();
       rbm.setVisible(true);
    }
    
}
