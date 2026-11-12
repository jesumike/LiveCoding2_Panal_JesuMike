/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_recursion;

import java.util.Scanner;

/**
 *
 * @author jesumike
 */
public class Panal_Problem2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 = input.nextInt();
        int number2 = input.nextInt();
       
        if (number1 < 0 || number2 < 0) {
            System.out.println("Invalid input");
        } else if (number1 == 0 && number2 == 0) {
            System.out.println("Undefined");
        } else {
            int result = gcd(number1, number2);
            System.out.println(result);
        }
        input.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}


