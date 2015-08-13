package com.starsea.im.biz.interceptor;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by beigua on 2015/8/12.
 */
public class ChooseDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return HandleDataSource.getDataSource();
    }

}