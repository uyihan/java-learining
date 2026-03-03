import java.util.Scanner;
/**
 *计算出个人工作得到的薪水
 * 时间2026.3.2
 * 作者：吴宇航
 */
public class YuXin {
    public static void main(String[] agrs){
        String name;
        int time;
        double qian;
        double shuilv;
        double shuiqian;
        double shuihou;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入工作者的姓名，工作时长，每小时的工钱，税钱");
        name=scanner.next();
        time=scanner.nextInt();
        qian=scanner.nextDouble();
        shuilv=scanner.nextDouble();
        shuiqian=time*qian;
        shuihou=shuiqian*shuilv;
        System.out.println(name+"的总工资是"+shuiqian+"税后是"+shuihou);
    }
}
