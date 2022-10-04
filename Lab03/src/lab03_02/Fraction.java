/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_02;
public class Fraction {
    public int topN;
    public int btmN;
    public boolean myEquals(Fraction x){
        return (topN == x.topN/x.topN && btmN == x.btmN/x.topN);
    }
    public void LowestTermFrac(){
        if (btmN % topN == 0){
            btmN /= topN;
            topN /= topN;
        }
    }
    public String toFloat(){
        double topN2 = topN, btmN2 = btmN;
        return Double.toString(topN2/btmN2);
    }
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        Fraction f2 = new Fraction();
        f2.topN = 4;
        f2.btmN = 16;
        Fraction f3 = new Fraction();
        f3.topN = 5;
        f3.btmN = 15;

        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());
    }
}
