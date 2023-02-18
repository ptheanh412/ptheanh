

package com.mycompany.bai1;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("phuong trinh bac nhat co dang la: ax+b=0");
        System.out.println("Nhap so a:");
        float a= sc.nextFloat();
        System.out.println("nhap so b:");
        float b= sc.nextFloat();
        float c;
        if (a==0){
            if(b==0){
                System.out.println("phuong trinh co vo so nghiem");
            }else{
                System.out.printf("phuong trinh vo nghiem");}
        }else{
            c=-b/a;
            System.out.printf("phuong trinh co nghiem la :x= %f",c);
            }
        }
    }  