package F.xx;
import java.util.Scanner;
public class x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = 0;
        while (true) {
            System.out.println("请输入你的行李重量 单位：Kg");
            age = sc.nextDouble();
            if (age < 20) {
                System.out.println("您的行李小于等于20Kg免费托运");
            } else if (age >= 20 && age < 30) {
                double a = (age - 19) * 5;
                System.out.println("您需要交" + a + "元的费用");
            } else if (age >= 30 && age < 40) {
                double b = (age - 29) * 10;
                System.out.println("您需要交" + b + "元的费用");
            } else if (age >= 40 && age < 50) {
                double c = (age - 39) * 15;
                System.out.println("您需要交" + c + "元的费用");
            } else if (age >= 50) {
                System.out.println("重量超出范围，不允许携带");
                return;
            }
        }
    }
}
