/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class Swing1 {

    public static void main(String[] args) {
        
        MyFrame mf = new MyFrame("Mon bouton", Color.blue);
        mf.getButton().addActionListener((e) ->{
            System.out.println("Coucou");
        });
        MyFrame mf1 = new MyFrame("toto","un bouton", Color.ORANGE);
        MyFrame mf2 = new MyFrame("bouton"); 
    }
}
