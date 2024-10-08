/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter8;

/**
 *
 * @author Lenovo S540
 */
import java.util.EnumSet;

public class EnumTest {

    public static void main(String[] args){
    System.out.println("All books:");

    for (Book book: Book.values ())
          System.out.printf("%-10s%-45s%s%n", book,book.getTitle(),book.getCopyrightYear());

    System.out.printf (
    "%nDisplay a range of enum constants:%n");

    for (Book book: EnumSet.range (Book.JHTP, Book.CPPHTP))
          System.out.printf("%-10s%-45s%s%n", book,book.getTitle(),book.getCopyrightYear());
    }
}
 