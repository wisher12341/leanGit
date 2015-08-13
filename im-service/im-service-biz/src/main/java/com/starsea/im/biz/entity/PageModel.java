package com.starsea.im.biz.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by beigua on 2015/8/13.
 */
public class PageModel implements Serializable {

    private static final long serialVersionUID = -8802145055234572275L;
    private int recordCount;
    private int pageSize;
    private int page = 1;
    private List<?> records;
    private String sortField;
    private boolean sortAsc = true;

    public PageModel() {
    }

    public int getRecordCount() {
        return this.recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNextStart() {
        return this.page < 1 ? 1 : (this.page - 1) * this.pageSize + (this.records != null ? this.records.size() : 0) + 1;
    }

    public List<?> getRecords() {
        return this.records;
    }

    public void setRecords(List<?> records) {
        this.records = records;
    }

    public int getPageCount() {
        return this.recordCount == 0 ? 0 : (this.recordCount + this.pageSize - 1) / this.pageSize;
    }

    public String getSortField() {
        return this.sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public boolean isSortAsc() {
        return this.sortAsc;
    }

    public void setSortAsc(boolean sortAsc) {
        this.sortAsc = sortAsc;
    }
}
