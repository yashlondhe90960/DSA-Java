package com.yash;

// Java Program to Illustrate Insertion of HTML File in
// Applet As Commands

// Importing required classes
import java.applet.*;
import java.awt.*;

// Note: Insertion of HTM:L file as comments

/* <applet code = AppletDemo width=400 height=500>
</applet>*/

// Java Program

// Class extending Applet
public class Applet extends AppletDemo {
    public void init()
    {
//        setBackground(Color.red);
//        setForeground(Color.green);
    }



    public void paint(Graphics g)
    {
        g.drawString("Welcome to Applets", 50, 50);
    }
}
