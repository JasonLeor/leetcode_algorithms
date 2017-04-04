package jason;

/**
 * Created by suliguo on 2017/4/4.
 */
public class HammingDistance_461 {
    public int sulution (int x ,int y){
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += ((x&(1<<i))^(y&(1<<i)))>0?1:0;
        }
        return res;
    }


    public static void main(String[] args) {
    }
}
