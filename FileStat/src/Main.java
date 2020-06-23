

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main
{



    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        String word_1, word_2;
        int count=0;
        for (int i=0;i<list.size();i++)
        {
            word_1 = list.get(i);
            count = 1;
            for (int j=i+1;j<list.size();j++)
            {
                word_2 = list.get(j);
                if (word_1.equals(word_2))
                {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            result.put(word_1,count);
        }
        return result;
    }

    public static  boolean  Number(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) throws NoSuchElementException, FileNotFoundException {

        File file = new File("E:\\java\\FileStat\\src", "book.txt");

        int countWord = 0;
        int countNumb = 0;
        int countLines = 0;

        Scanner sc = new Scanner(file);
        Scanner sc1 = new Scanner(file);
        Scanner sc2 = new Scanner(file);

        while (sc.hasNextLine())
        {
            countLines++;
            String[] array = sc.nextLine().split(" ");
            countWord = countWord + array.length;
        }
        while(sc1.hasNext())
        {
            String str = sc1.next();
            if(Number(str)==true)
            {
                countNumb++;
            }
        }
        ArrayList<String> word = new ArrayList<String>();
        for (int i = 0; i < countWord; i++)
        {
           //word.add(sc2.next());
        }
        Map<String, Integer> map = countWords(word);
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        sc.close();
        sc1.close();
        sc2.close();


        System.out.println("Количество слов: " + countWord);
        System.out.println("Количество строк: " + countLines);
        System.out.println("количество чисел: " + countNumb);
    }

}