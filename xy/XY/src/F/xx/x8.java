package F.xx;

import java.util.Scanner;
public class x8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的成绩");
            int score = scanner.nextInt();
            if (score>=90 && score<=100){
                System.out.println("恭喜您！您的成绩优秀获得精美笔记本一本");
            } else if (score>=80 && score<90){
                System.out.println("恭喜您！您的成绩良好获得精美钢笔一个");
            } else if (score>=70 && score<80){
                System.out.println("恭喜您！您的成绩及格获得笔记本一本");
            } else if (score>=60 && score<70){
                System.out.println("恭喜您！您的成绩及格获得钢笔一个");
            } else if (score>=0 && score<60 ){
                System.out.println("很抱歉，您的成绩不及格暂无奖励");
            } else {
                System.out.println("您输入成绩有误");
            }
        }
    }


