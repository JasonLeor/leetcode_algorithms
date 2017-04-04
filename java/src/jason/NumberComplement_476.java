package jason;

/**
 * Created by suliguo on 2017/4/4.
 */
public class NumberComplement_476 {
    public int sulition(int num){
        int temp =1;
        int temp2 = num;
        while (temp2>0){
            temp <<=1;
            temp2 >>=1;
        }
        return num^(temp-1);
    }

    public static void main(String[] args) {
        System.out.println(new NumberComplement_476().sulition(5));
    }
}
