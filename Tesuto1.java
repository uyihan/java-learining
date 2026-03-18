/**
 * 评委打分
 * 2026.3.17
 * 吴宇航
 */

import java.util.Scanner;

public class Tesuto1 {
    public static void main(String[] args) {
        //在比赛中，6个评委给选手打分，分数范围[0-100]间整数。
        //选手最后得分：去掉最高分和最低分后取4个评委的平均分
        int[] scoresArr = getScores();
        int max = scoresArr[0];
        int sum = 0;
        int min = scoresArr[0];
        for (int i = 0; i < scoresArr.length; i++){
            sum+=scoresArr[i];
        }
        for (int i = 0; i < scoresArr.length; i++) {
            if(max<scoresArr[i]){
                max = scoresArr[i];
            }
        }
        for (int i = 0; i < scoresArr.length; i++) {
            if(min>scoresArr[i]){
                min = scoresArr[i];
            }
        }
        int heikintensuu = (sum-max-min)/4;
        System.out.println("平均分为："+heikintensuu);
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委打的分数:");

        for (int i = 0; i < scores.length; ) {
            int score = sc.nextInt();
            if (score > 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("您在第" + (i+1) + "次输入的分数不正确请在输入一次");
            }
        }
        return scores;
    }

}