/**
 * 设计一个方法遍历数组，要求遍历的结果在一行上的. [11, 22, 33, 44, 55]
 * 2026.3.10
 * 吴宇航
 */
public class Tesuto1 {
    public static void main(String[] args) {
        int[] hairetsu = {11,22,33,44,55};
             hairetsu_hyouji(hairetsu);
    }
    public static void hairetsu_hyouji(int[] hairetsu){
        System.out.print("[");
        for (int i = 0; i < hairetsu.length; i++) {
            if (i == hairetsu.length - 1) {
                System.out.print(hairetsu[i]);
            }else{
                System.out.print(hairetsu[i]+", ");
            }
        }
            System.out.println("]");

    }
}