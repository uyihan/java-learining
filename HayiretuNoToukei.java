/**
 * 生成10个1-100的数（1）求出所有数据的和；（2）求所有数据的平均数；（3）统计有多少个数据比平均数小
 * 2026.3.7
 * 作者：吴宇航
 */
import java.awt.desktop.SystemEventListener;
import java.util.Random;
public class HayiretuNoToukei {
    public static void main(String[] args) {
        Random ra = new Random();
        int[] hayiretu = new int[10];
        int sum = 0;
        double avg = 0;
        int ransuu = hayiretu[0];
        for (int i = 0; i < hayiretu.length; i++) {
            ransuu = ra.nextInt(100) + 1;
            hayiretu[i] = ransuu;
        }
        for (int i = 0; i < hayiretu.length; i++) {
            sum += hayiretu[i];
        }
        System.out.println("总和为:" + sum);
        avg = (double) sum / hayiretu.length;
        System.out.println("平均数为:" + avg);
        int tousu = 0;
        for (int i = 0; i < hayiretu.length; i++) {
            if (hayiretu[i] < avg) {
                tousu++;
            }
        }
            System.out.println("有"+tousu+"个数比统计数少");
        for (int i = 0; i < hayiretu.length; i++) {
            ransuu = hayiretu[i];
            System.out.print(ransuu + " ");
        }
    }
}