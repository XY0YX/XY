package F.xx;

public class x3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 200; i++) {
            if (numbers(i)) {
                System.out.print(i + ",");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean numbers(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}

