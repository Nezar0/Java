package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {

    int  rezhim=0;
    int  xPad;
    int  xf;
    int  yf;
    int  yPad;
    int  thickness;
    boolean pressed=false;
    // текущий цвет
    Color maincolor;
    MyFrame f;
    MyPanel japan;
    JButton colorbutton;
    JColorChooser tcc;
    // поверхность рисования
    BufferedImage imag;
    // если мы загружаем картинку
    boolean loading=false;
    String fileName;
    public Main() {
        f=new MyFrame("Графический редактор");
        f.setSize(350,350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        maincolor=Color.black;

        JMenuBar menuBar = new  JMenuBar();
        f.setJMenuBar(menuBar);
        menuBar.setBounds(0,0,350,30);
        JMenu fileMenu = new  JMenu("Файл");
        menuBar.add(fileMenu);
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new  Runnable() {
            public void run() {
                new  Main();
            }
        });
    }
}
