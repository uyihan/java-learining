/**
 * 定义一个方法hairetsu hanai fukusei（复制数组的指定范围）将数组hairetsu从索引（包含from）开始到索引to结束（不包含to）的元素赋值给新的数组，将新的数组返回。
 * 2026.3.12
 * 吴宇航
 */
public class Tesuto4 {
    public static void main(String[] args){
        int[] hairetus = {1,2,3,4,56,7,5,34,3};
        int[] newhairetsu =hairetsuHanaiFukusei(hairetus,2,6);
        for (int i = 0; i < newhairetsu.length; i++) {
            System.out.print(newhairetsu[i]+" ");
        }

    }
    public static int[] hairetsuHanaiFukusei(int[] hairetsu,int from,int to){
        int indekkuto = 0;    //indekkuto为索引
        int[] newhairetsu = new int[to - from];
        for (int i = from; i < to ; i++) {
            newhairetsu[indekkuto] = hairetsu[i];
            indekkuto++;
        }
        return newhairetsu;
    }
}
