package jason;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suliguo on 2017/5/25.
 */
public class ThreeSumClosest {
    public Integer solution(List<Integer> list, Integer x) {
        if (list.size() < 3) return -1;
        int ret = 0;
        int distance = Integer.MAX_VALUE;

        list.sort(Integer::compareTo);

        for (int i = 0; i < list.size() - 2; ++i) {
            int j = i + 1;
            int k = list.size() - 1;
            while (j < k) {
                int temp_val = list.get(i) + list.get(j) + list.get(k);
                int temp_distance;
                if (temp_val < x) {
                    temp_distance = x - temp_val;
                    if (temp_distance < distance) {
                        distance = temp_distance;
                        ret = temp_val;
                    }
                    ++j;
                } else if (temp_val > x) {
                    temp_distance = temp_val - x;
                    if (temp_distance < distance) {
                        distance = temp_distance;
                        ret = temp_val;
                    }
                    --k;
                } else {
                    ret = temp_val;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        List in = new ArrayList();
        in.add(1);
        in.add(6);
        in.add(5);
        in.add(2);
        in.add(4);
        in.add(3);
        System.out.println(new ThreeSumClosest().solution(in,5));
    }
}
