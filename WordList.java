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
public class WordList 
{
 WordNode head;
 
 public void insert(String word, String URL)
 {
     if(!isWordFound(word))
     {
         WordNode n = new WordNode(word);
         if( head == null )
         {
            n.list.insert(URL);
            n.next = null;
            head = n;
            
         }
         else
         {
             WordNode temp = head;
             WordNode prev = null;
             while( temp != null)
             {
                 prev = temp;
                 temp = temp.next;
             }
             n.list.insert(URL);
             n.prev = prev;
             prev.next = n;
         }
     }
     else if(isWordFound(word))
     {
         searchWord(word).list.insert(URL);
     }
 }
 public WordNode searchWord(String word)
 {
     WordNode temp = head;
     while( temp != null)
     {
         if(temp.word.equals(word))
             return temp;
         temp =temp.next;
     }
     return null;
 }
 public boolean isWordFound(String word)
 {
     WordNode temp = head;
     while( temp != null)
     {
         if(temp.word.equals(word))
         {
             return true;
         }
         else
         {
             temp = temp.next;
         }
     }
     return false;
 }
 public String search(String word)
 {
//     URLListCollection result = new URLListCollection();
     if(isWordFound(word))
     {
         WordNode temp = head;
         if(temp.word.equals(word))
         {
          return "The list of Urls under word " + word +" are: [" + temp.list.toString() + " ]";
         }
         else
         {
             while(temp != null)
             {
                 if(temp.word.equals(word))
                 {
                     return "The list of Urls under word " + word +" are: [" + temp.list.toString() +" ]";
                 }
                 temp =temp.next;
             }
         }
     }
   return "The requested word "+ word + " is not found in the Word List.";
 }
 public void delete(String word)
 {
     WordNode temp = head;
     if(temp.word.equals(word))
     {
         head = head.next;
         temp = null;
     }
     else{
     while(temp != null )
     {
         if(temp.word.equals(word)){
             break;}
         temp = temp.next;
     }
     if(temp == head)
     {
         head = head.next;
         temp.next = null;
     }
     else if( temp.next == null)
     {
         temp.prev = null;
     }
     else
     {
         temp.prev.next = temp.next;
//         temp.next.prev = temp.prev;
         temp.next = null;
         temp.prev = null;
     }
     }
 }

 public void printWordAndUrls(String word)
 {
     WordNode temp = head;
//     String str = "";
     while(temp != null)
     {
         if(temp.word.equals(word))
         {
         System.out.print("Word is : "+ temp.word + "\nList of URLs under this word are:\n" +"[" + temp.list.toString()+"]");
         }
         temp =temp.next;
     }
     System.out.println("");
 }
 public String printWordList()
 {
     WordNode temp = head;
     String str = "[";
     while(temp != null)
     {
      
        str +=   temp.word + ", "; 
         
         temp =temp.next;
     }
    str += "]";
    return str;
 }
 public String printUrls(String word)
 {
    WordNode temp = head;
    String str = "[";
    if(isWordFound(word))
    {
      while(temp != null)
      {
        if(temp.word.equals(word))
        {
        str += temp.list.toString();
        }
        temp =temp.next;
      }
      str += "]";
    }
    else
    {
        return "Error! The word is not found in Word list";
    }
    return str;
 }
 
 
 @Override
 public String toString()
 {
     WordNode temp = head;
     if(head == null)
     {
         return null;
     }
    else if(head.word == null && head.next.word != null)
     {
         temp = head.next;
     }
     
     String str = printWordList() +"\n";
     while(temp != null)
     {
          str += printUrls(temp.word);
          temp = temp.next;
     }
     
     return str;
 }
}
