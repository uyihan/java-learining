/**
 * 输出整形的位数
 * 时间2026.3.1
 * 作者：吴宇航
 */
public class weishu {
    public static void main(String[] args){
        int num=243;      //定义整形变量，存放要判断的数
        String str;//定义字符串变量，存放结果
        if(num<10){
            str="一位数";
        }
        else if(num<100){
            str="二位数";
        }
        else if(num<1000){
            str="三位数";
        }
        else if(num<10000) {
            str = "四位数";
        }
            else{
                str="无法判断";

        }
        System.out.println(num+"是"+str);
    }
}
