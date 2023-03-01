/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

/**
 *
 * @author DELL
 */
public class tugas1maret {
     public static void main(String[] args) {
        JFrame j = new JFrame  ("DATA PENGHUNI KOS");
        
        
        JLabel Nama = new JLabel();
        Nama.setText("Nama");
        Nama.setBounds(50,50,100,30);
        j.add(Nama);
       
        JLabel Jkelamin = new JLabel();
        Jkelamin.setText("Jenis kelamin");
        Jkelamin.setBounds(50,100,100,30);
        j.add(Jkelamin);
      
         JLabel pekerjaan = new JLabel();
         pekerjaan.setText("Pekerjaan");
         pekerjaan.setBounds(50,150,100,30);
         j.add(pekerjaan);
         
         JLabel Alamat = new JLabel();
         Alamat.setText("Alamat");
         Alamat.setBounds(50,200,100,30);
         j.add(Alamat);
         
         
         
         JLabel Nohp = new JLabel();
         Nohp.setText("Nohp");
         Nohp.setBounds(50,250,100,30);
         j.add(Nohp);
         
         
         JTextField nameTxt = new JTextField();
         nameTxt.setBounds(150,50,200,30);
         j.add(nameTxt);
         
         JRadioButton j1 = new JRadioButton("Laki-Laki");
         j1.setBounds(150,100,100,30);
         JRadioButton j2 = new JRadioButton("Perempuan");
         j2.setBounds(250,100,150,30);
         ButtonGroup bg = new ButtonGroup();
         bg.add(j1);bg.add(j2);
         j.add(j1);
         j.add(j2);
                                
            
        String Pekerjaan[]={"Mahasiswa","Pegawai","Wirausaha"};        
        JComboBox cb =new JComboBox(Pekerjaan);    
        cb.setBounds(150,150,200,30);    
        j.add(cb);    
        
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
         
         j.setSize(500,500);
         j.setLayout(null);
         j.setVisible(true);  
     }
}

   
