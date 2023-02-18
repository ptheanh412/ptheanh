/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ktrasocp;

import java.util.Scanner;

public class KtraSoCP {

    public static void main(String[] args) {
        int a ;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap a: ");
            a = sc.nextInt();
        }while(a<=0);
        Kiemtra(a);
    }
    public static void Kiemtra(int a){
        int b = (int) Math.sqrt(a);
        if (a == b*b){
            System.out.println(a+" la so chinh phuong");
        }
    }
}
