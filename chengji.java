/**
 * 求总分和平均分
 * 时间2026.3.1
 * 作者：吴宇航
 */
public class chengji {
    public static void main(String[] args){
        double chengji1,chengji2;//定义成绩
        double zongfen=0;//总分
        int pingjun;//平均
        chengji1=99.5;
        chengji2=80.5;
        zongfen+=chengji1;
        zongfen+=chengji2;
        pingjun=(int)(zongfen/2);
        System.out.println("总分为:"+zongfen+"平均分为:"+pingjun);
    }
}
