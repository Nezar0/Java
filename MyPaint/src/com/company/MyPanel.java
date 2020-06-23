package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyPanel extends JPanel
{
    BufferedImage imag;
    public MyPanel()
    { }
    public void paintComponent (Graphics g)
    {
        if(imag==null)
        {
            imag = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D d2 = (Graphics2D) imag.createGraphics();
            d2.setColor(Color.white);
            d2.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        super.paintComponent(g);
        g.drawImage(imag, 0, 0,this);
    }
}
