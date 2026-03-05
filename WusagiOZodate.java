/**
 * 生兔子 有一对兔子，从出生第三个月起每个月生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假设兔子不死，输出3到12月每个月的兔子总数
 * 2026.3.4
 * 作者：吴宇航
 */
public class WusagiOZodate {
    public static void main(String[] args) {
        //初始化第1月和第2月的兔子
        int Wusagi1 = 1;     //第一个月
        int Wusagi2 = 1;     //第二个月
        int konogatunoWusagi;
        for (int gatu = 3; gatu < 13; gatu++) {
        konogatunoWusagi = Wusagi1 + Wusagi2;
        System.out.println("第"+gatu+"个月的兔子对数:"+konogatunoWusagi);
        Wusagi1 = Wusagi2;
        Wusagi2 = konogatunoWusagi;
        }
    }
}
