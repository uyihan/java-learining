/**
 * 卖飞机票，价格受淡季旺季、头等舱经济舱影响，旺季为5-10月，头等舱9折、经济舱8.5折，淡季为11-4月，头等舱7折、经济舱6.5折
 * 2026.3.16
 * 吴宇航
 */

import java.util.Scanner;

public class QikketoOUru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的价格:");
        int qikketoNoKakaku = sc.nextInt();
        System.out.println("请输入你买机票的月份:");
        int tsuki = sc.nextInt();
        System.out.println("请输入你买的是什么机票，0为头等舱、1为经济舱:");
        int qikketo = sc.nextInt();
        if (5 <= tsuki && tsuki <= 10) {
            qikketoNoKakaku = getqikketoNoKakaku(qikketoNoKakaku, qikketo, 0.9, 0.85);
        }
        if ((tsuki >= 1 && tsuki <= 4) || (tsuki == 11 || tsuki == 12)) {
            qikketoNoKakaku = getqikketoNoKakaku(qikketoNoKakaku, qikketo, 0.7, 0.65);
        }
        System.out.println(qikketoNoKakaku);
    }

    public static int getqikketoNoKakaku(int qikketoNokakaku, int qikketo, double v0, double v1) {
        if (qikketo == 0) {
            qikketoNokakaku = (int) (qikketoNokakaku * v0);
        } else {
            qikketoNokakaku = (int) (qikketoNokakaku * v1);
        }
        return qikketoNokakaku;
    }
}

