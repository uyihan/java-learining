import java.util.Scanner;
/**
 * 学生的成绩单
 * 2026.3.4
 * 作者：吴宇航
 */
public class GakuseiNoSeisekishou {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String namae1 = "张三";
        String namae2 = "李四";
        String namae3 = "王五";
        System.out.print("请按顺序输入张三的语文、数学、英语成绩:");
        int kokugo1 = scanner.nextInt();
        int suugo1 = scanner.nextInt();
        int eigo1 = scanner.nextInt();
        System.out.print("请按顺序输入李四的语文、数学、英语成绩：");
        int kokugo2 = scanner.nextInt();
        int suugo2 = scanner.nextInt();
        int eigo2 = scanner.nextInt();
        System.out.print("请按顺序输入王五的语文、数学、英语成绩：");
        int kokugo3 = scanner.nextInt();
        int suugo3 = scanner.nextInt();
        int eigo3 = scanner.nextInt();
        //分别计算三人平均分
        double heikinten1 = (double) (kokugo1+suugo1+eigo1)/3;
        double heikinten2 = (double) (kokugo2+suugo2+eigo2)/3;
        double heikinten3 = (double) (kokugo3+suugo3+eigo3)/3;
        System.out.print("---------------------成绩单---------------------");
        System.out.print("姓名    语文    数学    英语    平均分");
        System.out.println(namae1 + "  "+kokugo1+ "  "+suugo1+"  "+ heikinten1+"   ");
        System.out.println(namae2 + "  "+kokugo2+ "  "+suugo2+"  "+ heikinten2+"   ");
        System.out.println(namae3 + "  "+kokugo3+ "  "+suugo3+"  "+ heikinten3+"   ");
        double saikoutokuten = heikinten1 > heikinten2 ? heikinten1 : heikinten2;
        saikoutokuten = saikoutokuten > heikinten3 ? saikoutokuten : heikinten3;
        System.out.println("此次考试平均最高成绩:"+saikoutokuten);
    }
}
