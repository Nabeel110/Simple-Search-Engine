/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class SearchEngine 
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     WordList List = new WordList();
     System.out.println("\t\t\t\t\t\t\t\t\t\t WELCOME TO MY SEARCH ENGINE \t\t\t\t");
     System.out.println("\t\t\t\t\t\t\t\t\t\t   Powered by Nabeel Ahmed \t\t\t\t\t");
     do{
     System.out.println("Below is the List of Functions My Search Engine can do for you.\n"
                        +"Press 1: To insert a new word in the Word List along with its Url.\n"
                        +"Press 2: To Delete a word along with entire List of Urls associated with that word.\n"
                        +"Press 3: To search a word in Word List and return Urls present under this word.\n"
                        +"Press 4: To display all the words along with their list of URls.\n"
                        +"Press q: To exit and close Search Engine.");
     
     String N= sc.next();
      if( N.equals("1") )
     {
         System.out.println("Enter the word you want to insert in Word List: ");
         String word = sc.next().toLowerCase();
         System.out.println("Enter the Url you want to insert under this word");
         String url = sc.next().toLowerCase();
         List.insert(word, url);
         List.printWordAndUrls(word);
     }
     else if(  N.equals("2") )
     {
         System.out.println("Enter the word you want to delete in the Word List.");
         String word = sc.next();
         List.delete(word);
     }
     else if(  N.equals("3") )
     {
         System.out.println("Enter the word you want to search in the Word List.");
         String word = sc.next();
         System.out.println(List.search(word));
     }
     else if(  N.equals("4") )
     {
         System.out.println(List.toString());
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
}
     
//     WordList w1 = new WordList();
//     w1.insert("Asia", "Wiki.com");
////     w1.printWordAndUrls();
//     w1.insert("Asia", "Iba.edu.pk");
//     w1.insert("Asia", "Ibm.com");
//     w1.delete("Asia");
//     w1.printWordAndUrls("Asia");
//     w1.insert("Karachi", "lums.com");
//     w1.insert("Karachi", "Iba.com");
//     w1.insert("Karachi", "Yahoo.com");
//     w1.printWordAndUrls("Karachi");
//     w1.insert("Admission", "Wikipidea.com");
//     w1.insert("Admission", "nust.edu.pk");
//     w1.insert("Admission", "yahoo.com");
//     w1.printWordAndUrls("Admission");
//     System.out.println("Word List is : "+w1.printWordList());
//     System.out.println(w1.search("Admission"));
//     System.out.println(w1.search("Asia"));