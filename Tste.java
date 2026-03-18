/**
 * 生成随机5位数的验证码，前4个为a-z A-Z，第五个为数字
 * 2026.3.17
 * 吴宇航
 */

import java.util.Random;

public class Tste {
    public static void main(String[] args) {
        Random random = new Random();
        char[] hairetsu = new char[52];
        for (int i = 0; i < hairetsu.length; i++) {
            if (i <= 25) {
                hairetsu[i] = (char) (97 + i);
            } else {
                hairetsu[i] = (char) (65 + i - 26);
            }
        }
        String result = "";
        for (int i = 0; i < 4; i++) {
            int ranndomI = random.nextInt(hairetsu.length);
            result += hairetsu[ranndomI];
        }
        int suuji = random.nextInt(10);
        result+=suuji;
        System.out.println(result);
    }
}
