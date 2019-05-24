/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java Program to determine whether two strings are the anagram
Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.
 *
 * @author Alireza Hassanpour
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter charecter 1; ");
        String str1 = sc.next();
        System.out.println("Enter charecter 2 : ");
        String str2 = sc.next();
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
  
        //Checking for the length of strings  
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    }
    
}
