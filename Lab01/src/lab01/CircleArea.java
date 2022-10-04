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
public class CircleArea {
    public static void main(String[] args){
        double area;
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }
}
