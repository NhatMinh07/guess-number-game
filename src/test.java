import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] b = {15, 15, 11, 27,27};
        int m = mode(b);
        System.out.println( m ); // Missing statement
    }
    public static int mode(int[] array) {
        int[] spareArray = new int[101];//tao day so tu 1 -->100

        for (int i = 0; i < array.length; i++) {
            spareArray[array[i]]++;//luc này tất cả giá trị của spareArray đều bằng 0, --> lưu số lần lặp lại vào spareArray
            //System.out.println(array[i]+=1);
        }

        int ans = 101;
        int count = 0;
        //System.out.println(spareArray[11]);
        for (int j = 0; j < spareArray.length; j++) {
            if (spareArray[j] > count) {
                count = spareArray[j];
                ans = j;
            }
        }

        return ans;
    }
}
