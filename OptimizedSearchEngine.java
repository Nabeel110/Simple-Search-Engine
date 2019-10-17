/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class OptimizedSearchEngine 
{
 WordList[] W = new WordList[26];
 int ref = ('A');
// WordNode head;

    public OptimizedSearchEngine() 
    {
        for (int i = 0; i < W.length; i++) 
        {
         W[i] = new WordList();
        }
    }
 
 public  void insert(String word, String Url)
 {
     String Uword = word.toUpperCase();
     int chr = Uword.charAt(0);
     W[chr-ref].insert(word, Url);
     
 }
 public String search(String word)
 {
    String Uword = word.toUpperCase();
    return  W[Uword.charAt(0)-ref].search(word);
 }
 public void delete(String word)
 {
     W[word.toUpperCase().charAt(0)-ref].delete(word);
 }
public void printAll()
{
    for (int i = 0; i < W.length; i++) 
    {
        if(W[i].toString()!= null)
        {
        System.out.println(W[i].toString());
        }
        else
            continue;
     }
}
 
public void printWordAndUrls(String word)
{
    W[word.toUpperCase().charAt(0)-ref].printWordAndUrls(word);
}
public static void main(String[] args)
{
     Scanner sc = new Scanner(System.in);
     OptimizedSearchEngine Eng1 = new OptimizedSearchEngine();
     System.out.println("\t\t\t\t\t\t\t\t\t\t WELCOME TO MY OPTIMIZED SEARCH ENGINE \t\t\t\t");
     System.out.println("\t\t\t\t\t\t\t\t\t\t   Powered by Nabeel Ahmed \t\t\t\t\t");
     do{
     System.out.println("Below is the List of Functions My Search Engine can do for you.\n"
                        +"Press 1: To insert a new word in the Word List along with its Url.\n"
                        +"Press 2: To Delete a word along with entire List of Urls associated with that word.\n"
                        +"Press 3: To search a word in Word List and return Urls present under this word.\n"
                        +"Press 4: To display all the words along with their list of URls.\n"
                        +"Press Q/q: To exit and close Search Engine.");
     
     String N= sc.next();
      if( N.equals("1") )
     {
         System.out.println("Enter the word you want to insert in Word List: ");
         String word = sc.next().toLowerCase();
         System.out.println("Enter the Url you want to insert under this word");
         String url = sc.next().toLowerCase();
         Eng1.insert(word, url);
         Eng1.printWordAndUrls(word);
     }
     else if(  N.equals("2") )
     {
         System.out.println("Enter the word you want to delete in the Word List.");
         String word = sc.next();
         Eng1.delete(word);
     }
     else if(  N.equals("3") )
     {
         System.out.println("Enter the word you want to search in the Word List.");
         String word = sc.next();
         System.out.println(Eng1.search(word));
     }
     else if(  N.equals("4") )
     {
         Eng1.printAll();
     }
     else if ( N.equals("q") || N.equals("Q"))
     {
         break;
     }
     else
     {
         System.out.println("You have pressed wrong key chose from the given options:");
         continue;
     }
     }while(true);
             

 }


// public  boolean isWordFound(String word)
// {
//     WordNode temp = head;
//     while( temp != null)
//     {
//         if(temp.word.equals(word))
//         {
//             return true;
//         }
//         temp = temp.next;
//     }
//     return false;
// }
}
