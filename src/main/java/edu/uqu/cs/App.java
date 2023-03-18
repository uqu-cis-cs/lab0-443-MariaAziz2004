package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters(int num){

    for ( num = 1; num <= 110; num++ ){
    
    if (num % 2 ==0){
        System.out.println("Tweetle");
    }
    if (num % 4 ==0){
        System.out.println("Beetle");
    }
     if (num % 6 ==0){
        System.out.println("Poodle");
    }
    else { 
        System.out.println(" "+ num+ " ");
         }
}
}
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
   public static void phoneKeypad(String str){
    String result = "";
    for (int i =0; i<str.length(); i++) {
        char ch = str.toUpperCase().charAt(i);
    if (ch >= 'A' && ch <= 'C') { 
        result+= "2"; }
       else if (ch >= 'D' && ch <= 'F') { 
        result+= "3"; }
        else if (ch >= 'G' && ch <= 'I') { 
        result+= "4"; }
        else if (ch >= 'J' && ch <= 'L') { 
        result+= "5"; }
        else if (ch >= 'M' && ch <= 'O') { 
        result+= "6"; }
        else if (ch >= 'P' && ch <= 'S') { 
        result+= "7"; }
        else if (ch >= 'T' && ch <= 'V') { 
        result+= "8"; }
        else if (ch >= 'W' && ch <= 'Z') { 
        result+= "9"; }
    }
    System.out.println(result);
    }
    
    public static void main(String [] args) {
        

    Scanner input = new Scanner(System.in);            /* Write your code here */
     
    twisters(num);                                       //call method twisters()
    System.out.println("Enter a string: ");          //prompt user to enter a string 
    phoneKeypad(input.nextLine());                  //call method phoneKeypad(string)


    }

}
