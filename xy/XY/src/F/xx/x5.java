package F.xx;

public class x5 {
    public static void main(String[] args) {
        int[] studentHeights = new int[10];
        studentHeights[0] = 150;
        studentHeights[1] = 160;
        studentHeights[2] = 170;
        studentHeights[3] = 185;
        studentHeights[4] = 155;
        studentHeights[5] = 175;
        studentHeights[6] = 165;
        studentHeights[7] = 195;
        studentHeights[8] = 162;
        studentHeights[9] = 178;
        int maxHeight = studentHeights[0];
        double averageHeight = 0;
        for (int i = 0; i < studentHeights.length; i++) {
        if (studentHeights[i] > maxHeight) {
            maxHeight = studentHeights[i];
        }
        averageHeight += studentHeights[i];
    }
    averageHeight /= studentHeights.length;
    System.out.println("最高的学生身高是: " + maxHeight + "厘米");
    System.out.println("所有学生的平均身高是: " + averageHeight + "厘米");
    }
}
