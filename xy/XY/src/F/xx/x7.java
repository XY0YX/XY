package F.xx;

import java.util.Scanner;

public class x7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个六位数：");
        int number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("错误：请输入一个六位数。");
            return;
        }

        int tenThousand = number / 100000;
        int wan = (number % 100000) / 10000;
        int thousand = (number % 10000) / 1000;
        int hundred = (number % 1000) / 100;
        int ten = (number % 100) / 10;
        int one = number % 10;

        System.out.println("十万位：" + tenThousand);
        System.out.println("万位：" + wan);
        System.out.println("千位：" + thousand);
        System.out.println("百位：" + hundred);
        System.out.println("十位：" + ten);
        System.out.println("个位：" + one);
    }
}
