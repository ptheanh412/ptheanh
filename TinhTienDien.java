

package com.mycompany.tinhtiendien;

import java.util.Scanner;

public class TinhTienDien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float so_dien = sc.nextFloat();
        System.out.println("Nhap so dien:");
        if(so_dien>=0 && so_dien <= 50){
            float tien = so_dien * 1000;
            System.out.println("So tien phai tra la: %f " + tien);
        }else{
            float tien = 50 * 1000 +(so_dien -50)*1200;
            System.out.println("So tien phai tra la: %f " + tien);
        } 
    }
}
