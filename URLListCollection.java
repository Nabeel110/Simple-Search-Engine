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
public class URLListCollection 
{
 URLNode head;
 public void insert(String url)
 {
     URLNode n = new URLNode(url);
     if(head == null)
     {
         head = n;
     }
     else
     {
         URLNode temp = head;
         URLNode prev = null;
         if(!isURLFound(url))
         {
             while( temp != null)
             {
                 prev = temp;
                 temp = temp.next;
             }
             n.prev = prev;
             prev.next = n;
         }
     }
 }
 public boolean isURLFound(String URL)
 {
     URLNode temp = head;
     while(temp != null)
     {
         if(temp.URL.equals(URL))
             return true;
         else
             temp = temp.next;
     }
     return false;
 
 }
 @Override
 public String toString()
 {
     String str = "";
     URLNode temp = head;
     while( temp != null)
     {
         if( temp.next !=null)
         {
         str += temp.URL + ", ";
         }
         else
         {
             str += temp.URL + " ";
         } 
         temp  = temp.next;
     }
     return str;
 }
}
