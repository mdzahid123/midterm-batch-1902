package problems;


import java.util.*;//for Scanner(input from keyboard)

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {


        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


            public static void main(String[] args){

                //taking two strings from keyboard and making UpperCase if Lowercase given
                Scanner k = new Scanner(System.in);
                System.out.println("Enter 1st String");
                String S1 = k.nextLine().toUpperCase();
                System.out.println("Enter 2nd String");
                String S2 = k.nextLine().toUpperCase();

                //breaking the strings into character array
                char[] a = S1.toCharArray();
                char[] b = S2.toCharArray();

                //sorting the string in alphabetical or numerical order
                Arrays.sort(a);
                Arrays.sort(b);

                //checking for the same letter or number for the same index in Array
                boolean result = Arrays.equals(a,b);

                //printing out if the strings are anagram
                if(result == true)
                    System.out.println("Anagram");
                else
                    System.out.println("Not Anagram");

            }
        }




