package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel
{
    private JTextField textField = new JTextField(15);
    private JButton [] buttons = new JButton[10];
    private ActionListener textListener = new MyListener();
    private ActionListener commandListener = new CommandListener();
    public int prev = 0;
    public String prevOper = "";

    public MyPanel()
    {
        super();
        setBackground(new Color(180, 67, 83, 213));
        add(textField);

        for(int i = 0; i < 10; i++)
        {
            buttons[i] = new JButton("" + i);
            buttons[i].addActionListener(textListener);
            add(buttons[i]);
        }

        addCommandButtons();
    }

    @Override
    protected void paintComponent(Graphics graph)
    {
        super.paintComponent(graph);
        String str = "";
        Font font = new Font("Arial", Font.BOLD, 40);
        setFont(font);
        graph.drawString(str, 200, 100);
    }

    private void addCommandButtons()
    {
        JButton button = new JButton("+");
        button.addActionListener(commandListener);
        add(button);

        button = new JButton("-");
        button.addActionListener(commandListener);
        add(button);

        button = new JButton("*");
        button.addActionListener(commandListener);
        add(button);

        button = new JButton("/");
        button.addActionListener(commandListener);
        add(button);

        button = new JButton("=");
        button.addActionListener(commandListener);
        add(button);

        button = new JButton("C");
        //add(button);

        button.addActionListener(commandListener);
        add(button);
    }

    private class MyListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            textField.setText(textField.getText() + e.getActionCommand());
        }
    }

    private class CommandListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand().equals("C"))
            {
                textField.setText("");
                prevOper = "";
                prev = 0;
            }

            if(e.getActionCommand().equals("-"))
            {
                prev = Integer.valueOf(textField.getText());
                textField.setText("");
                prevOper = "-";
            }

            if(e.getActionCommand().equals("*"))
            {
                prev = Integer.valueOf(textField.getText());
                textField.setText("");
                prevOper = "*";
            }

            if(e.getActionCommand().equals("/"))
            {
                prev = Integer.valueOf(textField.getText());
                textField.setText("");
                prevOper = "/";
            }

            if(e.getActionCommand().equals("+"))
            {
                prev = Integer.valueOf(textField.getText());
                textField.setText("");
                prevOper = "+";
            }

            if(e.getActionCommand().equals("="))
            {
                if(prevOper != "" && !textField.getText().equals(""))
                {
                    float numb = Integer.valueOf(textField.getText());
                    switch (prevOper)
                    {
                        case "+":
                            textField.setText(String.valueOf(prev + numb));
                            break;

                        case "-":
                            textField.setText(String.valueOf(prev - numb));
                            break;

                        case "*":
                            textField.setText(String.valueOf(prev * numb));
                            break;

                        case "/":
                            if(numb != 0)
                                textField.setText(String.valueOf(prev / numb));
                            else
                                textField.setText("");
                            break;
                    }

                    prevOper = "";
                }
            }
        }
    }
}