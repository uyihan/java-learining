import java.util.Scanner;
   /**
     * 计算圆柱体表面积
     * 公式2Πrr+2Πrh
     * 日期:2026年2月27日
     * 作者：吴宇航
    */
public class CylinderArea{
    public final static double PI=3.1415926;   //定义常量
       public static void main(String[] args){
          //定义变量0
           double  cylinderarea;
           double radius;
           double higt;
           //输入半径
           System.out.print("请输入圆柱体的半径:");
           Scanner scanner=new Scanner(System.in);
           radius=scanner.nextDouble();
           System.out.print("请输入圆柱体的高:");
           Scanner scanner1=new Scanner(System.in);
           higt=scanner1.nextDouble();
           cylinderarea=2*PI*radius*radius+2*PI*radius*higt;
           System.out.println("半径为"+radius+"高为"+higt+"的圆柱体的表面积为"+cylinderarea);
       }
}
