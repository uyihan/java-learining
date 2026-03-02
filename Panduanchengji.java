import java.util.Scanner;
/**
 * 判断学生成绩是否为优秀
 */
public class Panduanchengji {
    public static void main(String[] args){
        Scanner scanner;
        double chengji;
        String jieguo;
        System.out.print("请输入成绩:");
        scanner=new Scanner(System.in);
        chengji=scanner.nextDouble();
        //条件表达式
        jieguo=chengji>=90?"成绩为优秀":"您需要努力";
        System.out.println(jieguo);
    }
}
