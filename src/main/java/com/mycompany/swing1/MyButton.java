/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing1;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Malaury
 */
public class MyButton extends JButton{
    private Color color;
    
    public MyButton(String text, Color color){
        super(text);
        this.color=color;
        setUp();
    }
    
    private void setUp(){
        this.setBackground(color);
    }
    
}
