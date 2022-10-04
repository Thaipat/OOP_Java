/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.*;

/**
 *
 * @author ACER
 */
public class Seconds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hours : ");
        int hours = input.nextInt();
        System.out.print("Mins : ");
        int mins = input.nextInt();
        System.out.println("Secs = "+(hours*3600+mins*60));
    }
}
