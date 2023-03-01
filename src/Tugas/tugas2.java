/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class tugas2 {
     public static void main(String[] args) {
        JFrame j = new JFrame ("DATA PENGHUNI KOS");
        
        
        JLabel Nama = new JLabel();
        Nama.setText("Nama");
        Nama.setBounds(50,100,100,30);
        j.add(Nama);
       
        JLabel Jkelamin = new JLabel();
        Jkelamin.setText("Jenis kelamin");
        Jkelamin.setBounds(50,150,100,30);
        j.add(Jkelamin);
      
        
         JLabel Alamat = new JLabel();
         Alamat.setText("Alamat");
         Alamat.setBounds(50,200,100,30);
         j.add(Alamat);
         
 
         
         JLabel Nohp = new JLabel();
         Nohp.setText("Nohp");
         Nohp.setBounds(50,250,100,30);
         j.add(Nohp);
         
         
         JTextField nameTxt = new JTextField();
         nameTxt.setBounds(150,100,200,30);
         j.add(nameTxt);
         
         JTextField JkelaminTxt = new JTextField();
         JkelaminTxt.setBounds(150,150,200,30);
         j.add(JkelaminTxt);
         
         JTextField AlamatTxt = new JTextField();
         AlamatTxt.setBounds(150,200,200,30);
         j.add(AlamatTxt);
      
         
         JTextField NohpTxt = new JTextField();
         NohpTxt.setBounds(150,250,200,30);
         j.add(NohpTxt);
         
         
        JButton saveButton = new JButton();
        saveButton.setText("Simpan");
        saveButton.setBounds(150,300,100,50);
         j.add(saveButton);
         
         j.setSize(800,800);
         j.setLayout(null);
         j.setVisible(true);  
     }
}

   
