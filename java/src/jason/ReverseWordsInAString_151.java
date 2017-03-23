package jason;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by suliguo on 2017/3/23.
 */
public class ReverseWordsInAString_151 {

    public String reverseWords(String s) {
        List<String> temp = Arrays.asList(s.trim().split(" "));
        StringBuffer tempbuff = new StringBuffer();
        Collections.reverse(temp);
        temp.forEach(o -> {
            if (!o.equals(""))
                tempbuff.append(o.trim() + " ");
        });
        return tempbuff.toString().trim();
    }
}
