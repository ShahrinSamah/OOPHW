/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter6;

/**
 *
 * @author Lenovo S540
 */
//fig 6.10
public class MethodOverload
{
    public static void main(String[] args)
    {
       System.out.printf("Square of integer 7 is %d%n",square(7));
       System.out.printf("Square of double 7.5 is %f%n",square(7.5));
}
    public static int square(int intValue)
    {
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue * intValue;
    }
    public static double square(double doubleValue)
    {
        System.out.printf("%nCalled square with double argument: %f%n",doubleValue);
        return doubleValue * doubleValue;
    }
}