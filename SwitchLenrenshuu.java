/**
 * 有关switch语句的练习
 * 时间2026.3.3
 * 作者：吴宇航
 */
import java.util.Scanner;
public class SwitchLenrenshuu {
    public static void main(String[] args){
        String A,B,C,D;
        System.out.print("请输入你的成绩等级:");
        Scanner scanner =new Scanner(System.in);
            String seiseki =scanner.next();
        switch (seiseki){
            case "A":
                System.out.print("成绩优秀，继续保持！");
                break;
            case "B":
                System.out.print("成绩中等，好好努力！");
                break;
            case "C":
                System.out.print("成绩良好，好好努力！");
                break;
            case "D":
                System.out.print("成绩及格，好好加油！");
                break;
            default:
                    System.out.print("您输入的格式不正确");
        }
    }
}
