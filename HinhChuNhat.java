

package CS311H_Son;

import java.util.Scanner;


public class HinhChuNhat {
    Scanner kb=new Scanner(System.in);
    int a,b;
            
    void input(){
        System.out.println("Dang Van Son \nTinh Chu Vi & Dien Tich HCN");
        System.out.println(" Nhap Chieu Dai:");
        a =kb.nextInt();
        System.out.println(" Nhap Chieu Rong:");
        b =kb.nextInt();
    }
    void output(){
        System.out.println("Chu vi (P)="+"("+a+"+"+b+")"+"*"+2+"="+(a+b)*2);
         System.out.println("Dien Tich (S)="+a+"*"+b+"="+(a*b));
    }
    
    
    public static void main(String[] args) {
    HinhChuNhat c = new HinhChuNhat();
    c.input();
    c.output();
    }

}
