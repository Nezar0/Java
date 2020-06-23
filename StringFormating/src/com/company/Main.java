package com.company;


public class Main {

    public static void main(String[] args)
    {

        String str = "Hello, ${0}, I am ${1} - ${2} - ${3}";

        String name = "Igor";
        String lastName  = "jarvis";
        String description  = "AI from some movie";
        String b = "gj";

        StringFormatter formatter = new StringFormatter();
        String[] words = new String[] { name, lastName , description ,b };

        System.out.println(formatter.Format(str, words));
    }
}