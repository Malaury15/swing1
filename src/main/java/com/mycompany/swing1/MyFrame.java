/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing1;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Malaury
 */
public class MyFrame extends JFrame{
    private String buttonText;
    private Color buttonColor;
    private MyButton button;
    
    public MyFrame(String buttonText){
        this("My frame", buttonText, null);
    }
    
    public MyFrame(String buttonText, Color buttonColor){
        this("My frame", buttonText, buttonColor);
    }
        
        
    public MyFrame(String title, String buttonText, Color buttonColor){
        super(title);
        this.buttonText = buttonText;
        this.buttonColor = buttonColor;
        this.setUpAndDisplay();
    }
    
    
    private void setUpAndDisplay(){
        this.getContentPane().setLayout(new FlowLayout());
        //créer un bouton 
        button = new MyButton(this.buttonText, this.buttonColor);
        //ajouter le bouton dans le cadre (mauvaise pratique)
        this.add(button);
   
      
        //dimensionner le cadre
        this.setSize(200,200);
        //faire en sorte que fermer le cadre finisse l'appli
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //afficher le cadre
        this.setVisible(true);
    }

    public MyButton getButton() {
        return button;
    }
    
    
}
