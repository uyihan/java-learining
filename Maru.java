/**
 * 定义一个方法，求圆的面积
 * 2026.3.9
 * 吴宇航
 */
import java.util.Scanner;
public class Maru {
    public static final double PI = 3.1415926;
    public static void main(String[] args) {
        System.out.println("请输入半径的值");
        Scanner scanner = new Scanner(System.in);
        int hankei = scanner.nextInt();
        syuucyou(hankei);
    }
    public static void syuucyou(int hankei){
        double menseki = PI*hankei*hankei;
        System.out.println("圆的面积是："+menseki);
    }
}
