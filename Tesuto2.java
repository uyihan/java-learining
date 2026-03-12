/**
 * 设计一个方法求数组的最大值，并将最大值返回
 * 2026.3.11
 * 吴宇航
 */
public class Tesuto2 {
    public static void main(String[] args) {
        int[] hairetsu = {1, 3, 5, 6, 2, 9};
        hairetsu_hyouji(hairetsu);
        int max =hairetsu_hyouji(hairetsu);
        System.out.println("最大值为:"+max);
    }
    public static int hairetsu_hyouji(int[] hairetsu){
        int max = hairetsu[0];
        for (int i = 1; i < hairetsu.length; i++) {
            if (hairetsu[i] > max) {
                max = hairetsu[i];
            }
        }
            return max;
    }
}
