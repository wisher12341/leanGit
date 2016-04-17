package com.starsea.im.aggregation.util;

import org.springframework.stereotype.Component;

/**
 * Created by danny on 16/4/12.
 */

@Component
public class MathToolsUtil {

    //总分
    public long getSum(int[] hcs){

        long sunTemp = 0;
        for(long hc:hcs){

            sunTemp+=hc;
        }

        return sunTemp;

    }
    //平均分
    public long getAvg(int[] hcs){

        long avg = getSum(hcs)/hcs.length;

        return avg;

    }

    //方差
    public long getVar(int[] hcs){

        long avg=getAvg(hcs);

        long var = 0;
        for(long hc:hcs){
            var += (hc - avg) * (hc - avg);
        }

        return var/hcs.length;
    }

   //标准差
    public long getStd(long var){

      return (long)Math.sqrt(var);
    }

    //标准分
//    public long getStdCore(int[] hcs){
//
//
//
//    }


}
