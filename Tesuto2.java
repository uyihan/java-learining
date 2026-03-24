/**
 * 数字加密
 * 2026.3.18
 * 吴宇航
 */

import java.util.Scanner;

public class Tesuto2 {
    //某系统的数字加密（大于0），采用加密方式进行传输
    //规则：先得到每位数，然后每位数都加上5，在对10求余，最后将所有数字反转，得到一串新数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int temp = number;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        int number0 = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp0 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp0;
        }
        for (int i = 0; i < arr.length; i++) {
            number0 = number0 * 10 + arr[i];
        }
        System.out.println("加密后的数为:" + number0);
    }
}

