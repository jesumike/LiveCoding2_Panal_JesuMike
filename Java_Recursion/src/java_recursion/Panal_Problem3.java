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
public class Panal_Problem3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    //MUST READ!!
    //Enter the number of elements first.
    //Example: If you enter 4, you must enter 4 numbers afterward.
    int size = input.nextInt();
    
    if (size <= 0){
        System.out.println("Invalid Array Size");
    }else{
        int[] values = new int[size];
        readArray(input, values, 0);
        
           System.out.println("Array Sum: " + arraySum(values, 0));
            System.out.println("Largest Element: " + findMaximum(values, 0));
            System.out.println("Number of Even Elements: " + countEven(values, 0));
        }
        input.close();
    }
    public static void readArray(Scanner input, int[] values, int index) {
        if (index == values.length) {
            return;
        }
        values[index] = input.nextInt();
        readArray(input, values, index + 1);
    }
    public static int arraySum(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }
        return values[index] + arraySum(values, index + 1);
    }   
    public static int findMaximum(int[] values, int index) {
        if (index == values.length - 1) {
            return values[index];
        }
        int maximum = findMaximum(values, index + 1);
        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
        }
    }
    
    public static int countEven(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }

        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            return countEven(values, index + 1);
        }
    }
} 

