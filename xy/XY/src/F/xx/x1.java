package F.xx;

public class x1 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 2; i <=100 ; i++) {
            int x = 2;
            while (i%x != 0){
                x++;
            }
            if(i == x){
                if(j%5 == 0){
                    System.out.print(i + "\n");
                }else {
                    System.out.print(i + "\t");
                }
                j++;
            }
        }
    }
}
