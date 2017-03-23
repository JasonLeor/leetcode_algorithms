package jason;


/**
 * Created by suliguo on 2017/3/26.
 */
public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        int one = 1;
        int[] temp = new int[digits.length+1];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + one;
            one = digits[i] / 10;
            digits[i] = digits[i] % 10;
            temp[i+1]=digits[i] % 10;
        }
        if (one >0&&digits[0]==0){
            temp[0]=one;
            return temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(new PlusOne_66().plusOne(new int[]{0}));
    }

}
