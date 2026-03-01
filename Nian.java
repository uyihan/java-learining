import java.util.Scanner;
/**
 * 判断年份是闰年还是平年
 * 时间2026.3.1
 * 作者：吴宇航
 */
public class Nian {
    public static void main(String[] args){
        //定义年份变量0
        int nian;
        System.out.print("请输入年份");
        Scanner scanner=new Scanner(System.in);
        nian=scanner.nextInt();
        //成为闰年的条件为：年份值能被4整除，但不能被100整除；年份值能被400整除
        if((nian%4==0&&nian%100!=0)||nian%400==0){
            System.out.print("该年份为闰年");
        }
        else{
            System.out.print("该年份为平年");
        }
    }

}
