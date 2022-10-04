/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;
import java.util.*;
public class Lab02 {
    public static void main(String[] args) {
//        Scanner inputInt = new Scanner(System.in);
//        int x = inputInt.nextInt();
//        if(x >= 10 && 100 > x){
//           System.out.println("Yes : "+x);
        int round = 1;
        for(int a = -10; a < 10; a += 2){
            System.out.print(round++);
            System.out.print("|"+a+"|");
            System.out.println(2+3*a);
        }
    }
    
}
