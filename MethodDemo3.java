/**
 * 定义一个方法，求一家商店每个季度的营业额。根据方法在计算一整年的营业额
 * 2026.3.9
 * 吴宇航
 */
public class MethodDemo3 {
    public static void main(String[] args){
      int sum1 = getsum(10,20,30);
        int sum2 = getsum(10,20,30);
        int sum3 = getsum(10,20,30);
        int sum4 = getsum(10,20,30);
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println("一年的营业额为："+sum);
    }
    public static int getsum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
