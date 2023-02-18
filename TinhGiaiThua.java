/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinhgiaithua;

import java.util.Scanner;
public class TinhGiaiThua {

    public static void main(String[] args) {
      
        int a;
        System.out.println("Nhap vao so can tinh: ");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         double n = 1;
        int i = 1;
        while(i<=a)
        {
            n = n * i;
            i++;
        }
        System.out.println("Giai thua cua "+a+" la: "+n);
    }
}
