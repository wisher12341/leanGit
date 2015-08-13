package com.starsea.im.biz.interceptor;

/**
 * Created by beigua on 2015/8/12.
 */
public class HandleDataSource {
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();
    public static void putDataSource(String datasource) {
        holder.set(datasource);
    }

    public static String getDataSource() {
        return  holder.get();
    }
}