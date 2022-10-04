/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
         if( n1.equals(n2) ) {
         System.out.println("==" );
         } else {
         System.out.println("!=");
         }
    }
}
