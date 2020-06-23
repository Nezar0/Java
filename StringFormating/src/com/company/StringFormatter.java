package com.company;

public class StringFormatter
{
    public String Format(String main, String[] words)
    {
        for(int i = 0; i < words.length; i++)
            if (main.contains("${" + i + "}"))
                main = main.replace("${" + i + "}", words[i]);

        return main;
    }
}