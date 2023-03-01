/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author DELL
 */
public class NewMain {
    public static void main(String[] args) {
        JFrame j = new JFrame ("jframe pertamaku");
        
        JLabel username = new JLabel();
        username.setText("username");
        username.setBounds(50,100,100,30);
        j.add(username);
      
        
         JLabel password = new JLabel();
         password.setText("passwod");
         password.setBounds(50,150,100,30);
         j.add(password);
         
         JTextField usernameTxt = new JTextField();
         usernameTxt.setBounds(150,100,200,30);
         j.add(usernameTxt);
         
         JTextField passwordTxt = new JTextField();
         passwordTxt.setBounds(150,150,200,30);
         j.add(passwordTxt);
         
         JButton loginButton = new JButton();
         loginButton.setText("login");
         loginButton.setBounds(150,200,200,50);
         j.add(loginButton);
         
         j.setSize(800,800);
         j.setLayout(null);
         j.setVisible(true);  
    }
}
