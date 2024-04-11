package F.xx;

import java.util.Scanner;

public class xx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今年的年份");
        int year = sc.nextInt();
        if (year % 4 == 0 &&(year % 100 != 0 ||year % 400 ==0 )) {
            System.out.println("闰");
        }else {
            System.out.println("平");
        }
    }
}