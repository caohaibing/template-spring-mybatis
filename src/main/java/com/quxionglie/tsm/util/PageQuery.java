package com.quxionglie.tsm.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xionglie.qu
 * Date:   2014-09-12
 */
public class PageQuery {
    private PageModel pageModel;
    private Map<String, Object> params;
    private String orderBy;
    private String groupBy;

    public PageQuery() {
        this(new PageModel(), new HashMap<String, Object>());
    }

    public PageQuery(PageModel pageModel) {
        this(pageModel, new HashMap<String, Object>());
    }

    public PageQuery(PageModel pageModel, Map<String, Object> params) {
        this(pageModel, params, null);
    }

    public PageQuery(PageModel pageModel, Map<String, Object> params, String orderBy) {
        this.pageModel = pageModel;
        this.params = params;
        this.orderBy = orderBy;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public void putParams(String k, Object v) {
        this.params.put(k, v);
    }
}
