/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7;

/**
 *
 * @author Lenovo S540
 */
public class Card {
  private final String face;
  private final String suit; 

  public Card(String cardFace, String cardSuit)
   {
     this.face = cardFace; 
     this.suit = cardSuit; 
  }
  public String toString()
{
     return face + " of " + suit;
}
    
}
