
package CS311H_Son;
import java.util.Scanner;

public class TinhToanTren2Ps2 {
    int tu1,mau1,tu2,mau2;
    char kt;
    void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dang Van Son \nTinh Toan Tren 2 Phan So");
        System.out.println("Nhap Phan So Thu 1");
        System.out.println("Nhap Tu:");
        tu1 =scanner.nextInt();
        System.out.println("Nhap Mau <>0:");
        mau1 = scanner.nextInt();
        System.out.println("Nhap Phan So Thu 2:");
        System.out.println("Nhap Tu:");
        tu2 = scanner.nextInt();
        System.out.println("Nhap Mau <>0:");
        mau2 = scanner.nextInt();
        System.out.println("Nhap phep toan(+,-,*,/)");
        kt = scanner.next().charAt(0);
    }
    String Giai(){
        if(kt == '+') return "Tong:" + tu1+ "/" +mau1+ "+" +tu2+"/"+mau2+ "=" +(tu1*mau2+tu2*mau1)+ "/" +(mau1*mau2);
        if(kt == '-') return "Hieu:"+tu1+ "/" +mau1+ "+" +tu2+"/"+mau2+ "=" +(tu1*mau2-tu2*mau1)+ "/" +(mau1*mau2);
        if(kt == '*') return "Tich:"+tu1+ "/" +mau1+ "+" +tu2+"/"+mau2+ "=" +(tu1*tu2)+ "/" +(mau1*mau2);
        if(kt == '/'){
            if(tu2 == 0) return "Khong tinh duoc.";
            else return "Tich:"+tu1+ "/" +mau1+ "+" +tu2+"/"+mau2+ "=" +(tu1*mau2)+ "/" +(mau1*tu2);
        }
        
    return"Khong tinh duoc.";
    }
    void output(){
        System.out.println(Giai());
    }
    public static void main(String[] args) {
        TinhToanTren2Ps2 c = new TinhToanTren2Ps2();
        c.input();
        c.output();
    }
}
