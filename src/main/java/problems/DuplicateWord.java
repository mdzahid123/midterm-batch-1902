package problems;

/**
 * Created by mrahman on 04/22/17.
 */

/*
 * Write a java program to find the duplicate words and their number of occurrences in the string.
 * Also Find the average length of the words.
 */
    import java.util.*; // we can import the whole package by typing  .*;

    // we need to import hashMap Scanner keySet

     public class DuplicateWord {

       public static void main(String[] args)
          {


                //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

                Scanner obj = new Scanner(System.in);
                System.out.println("Enter string");
                String input =obj.nextLine();


                String words[] = input.split(" ");
                Map<String, Integer> wordMap = new HashMap<String, Integer>();


                for(String cup:words)
                {
                    String str = cup.toLowerCase();

                    if(wordMap.get(str) != null)
                    {
                        wordMap.put(str, wordMap.get(str) +1);
                    }
                    else
                    {
                        wordMap.put(str, 1);
                    }
                }

                Set<String> str2 = wordMap.keySet();
                for(String str : str2)
                {
                    if(wordMap.get(str)>1)
                    {
                        System.out.println(str+ " repeated "+wordMap.get(str)+" times ");
                    }
                }


            }

}
