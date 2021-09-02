/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solutions;

import java.util.Scanner; //imports Scanner class

public class Solution03 {
/*
Create a program that prompts for a quote and an author.
    create Scanner object 'scan'
    create String objects 'quote' and 'author'
    prompt for quote and author
    read quote and author using 'scan'
Display the quotation and author as shown in the example output.
    print 'author' says, "'quote'"
        print quotation marks using \"
 */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); //scanner object
        String author,quote; //string objects needed for input

        System.out.print("What is the quote? ");//prompt user for quote
        quote = scan.nextLine(); //take in quote
        System.out.print("Who said it? "); //prompt user for author
        author = scan.nextLine(); //take in author

        System.out.println(author + " says, \"" + quote + "\"");






    }

}
