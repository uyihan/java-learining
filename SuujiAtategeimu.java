/**
 * 猜数字游戏
 * 2026.3.6
 * 作者：吴宇航
 */
import java.util.Random;    //导入随机数的包
import java.util.Scanner;
public class SuujiAtategeimu {
    public static void main(String[] args) {
        Random ra = new Random();
        //随机数范围取值 1-100
        //生成随机数
        //秘诀
        //用它生成7到15的随机数
        //1.把这个范围的头尾都减去一个值，从范围0开始：减去7  范围 0-8
        //2.尾巴加1  范围 0-9
        //3.最终结果加上第一步减去的值
        Scanner sc = new Scanner(System.in);
            int suuji = ra.nextInt(100) + 1;
        System.out.println("请输入你猜的数字:");
        int atatesuuji = sc.nextInt();
        while(atatesuuji != suuji) {
            if (atatesuuji < suuji) {
                System.out.println("猜小了:");
            } else if (atatesuuji > suuji) {
                System.out.println("猜大了:");
            }atatesuuji = sc.nextInt();
        }
                System.out.println("恭喜你猜对了:");


    }
}
