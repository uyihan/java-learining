/**
 * 定义一个方法判断数组中的某一个数据是否存在，将结果返回调用处
 * 2026.3.11
 * 吴宇航
 */
public class Tesuto3 {
    public static void main(String[] args){
     int[] hairetsu = {1,2,5,134,42};
     boolean suuji = hairetsuYousoSonzaiKakunin(hairetsu,5);
     System.out.println(suuji);
    }
    public static boolean hairetsuYousoSonzaiKakunin(int[] hairetsu,int suuji){
        for (int i = 0; i < hairetsu.length; i++) {
            if (suuji == hairetsu[i]) {
                return true;
            }
        }
            return false;
    }
}
