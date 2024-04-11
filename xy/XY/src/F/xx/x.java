package F.xx;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今年的年份");
        int year = sc.nextInt();
        System.out.println("请输入今年的月份");
        int month = sc.nextInt();
        int days = 0;
        if (month == 4||month == 6||month == 9||month == 11) {
            days = 30;
        }else if (month == 2) {
            if (year % 4 == 0 &&(year % 100 != 0 ||year % 400 ==0 )) {
                days = 29;
            }else {
                days = 28;
            }
        }else {
            days = 31;
        }
        System.out.println("现在是" + year + "年的" + month + "月份，这个月有" + days + "天");
    }
}
