/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.Arrays;

/**
 *
 * @author noelia
 */
public class UT0506 {

    /**
     *
     */
    public static void main(String[] args) {

        int array1[] = {1, 2, 3};
        int array2[] = {1, 2, 3};
        int array3[] = {1, 2, 3, 4};
        int array4[] = {1, 2, 2};

        System.out.println(Arrays.equals(array1, array2)
                ? "Son iguales" : "Son diferentes");
        System.out.println(Arrays.equals(array3, array1) 
                ? "Son iguales" : "Son diferentes");
        System.out.println(Arrays.equals(array1, array4) 
                ? "Son iguales" : "Son diferentes");
        
        

    }

}
