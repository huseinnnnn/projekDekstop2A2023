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
public class lth1 {
     public static void main(String[] args) {
        JFrame j = new JFrame ("Registrasi User");
        
        
        JLabel name = new JLabel();
        name.setText("name");
        name.setBounds(50,100,100,30);
        j.add(name);
       
        JLabel username = new JLabel();
        username.setText("username");
        username.setBounds(50,150,100,30);
        j.add(username);
      
        
         JLabel password = new JLabel();
         password.setText("passwod");
         password.setBounds(50,200,100,30);
         j.add(password);
         
         JLabel email = new JLabel();
         email.setText("email");
         email.setBounds(50,250,100,30);
         j.add(email);
         
         JLabel Nohp = new JLabel();
         Nohp.setText("Nohp");
         Nohp.setBounds(50,300,100,30);
         j.add(Nohp);
         
         
         JTextField nameTxt = new JTextField();
         nameTxt.setBounds(150,100,200,30);
         j.add(nameTxt);
         
         JTextField usernameTxt = new JTextField();
         usernameTxt.setBounds(150,150,200,30);
         j.add(usernameTxt);
         
         JTextField passwordTxt = new JTextField();
         passwordTxt.setBounds(150,200,200,30);
         j.add(passwordTxt);
         
         JTextField emailTxt = new JTextField();
         emailTxt.setBounds(150,250,200,30);
         j.add(emailTxt);
         
         
         JTextField NohpTxt = new JTextField();
         NohpTxt.setBounds(150,300,200,30);
         j.add(NohpTxt);
         
         
        JButton RegisterButton = new JButton();
         RegisterButton.setText("Register");
         RegisterButton.setBounds(150,350,100,50);
         j.add(RegisterButton);
         
         j.setSize(800,800);
         j.setLayout(null);
         j.setVisible(true);  
     }
}

    

