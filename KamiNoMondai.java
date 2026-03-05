/**
 * 已知珠穆朗玛峰的高度为884430毫米，一张纸张的厚度为0.1毫米，将纸张折叠多上次能到达珠穆朗玛峰的高度
 *2026.3.5
 * 作者：吴宇航
 */
public class KamiNoMondai {
    public static void main(String[] args){
        double kami = 0.1;
        double yama = 884430;
        int kaisuu = 0;
        while(kami<yama){
            kami = 2*kami;
            kaisuu++;
        }
         System.out.println(kaisuu);
    }

}
