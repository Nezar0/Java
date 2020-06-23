package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        super();
        setTitle("My Calculator");
        setSize(200, 300);
        setLocationRelativeTo(null);
        JPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}