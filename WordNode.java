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
public class WordNode 
{
  WordNode prev;
  String word;  
  URLListCollection list = new URLListCollection();
  WordNode next;

    public WordNode(String word) 
    {
        this.word = word;
    }
}
