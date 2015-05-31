package com.quxionglie.tsm.util;

import java.util.List;

public class PageModel {

    // 滑动窗口默认的大小(10)
    private int DEFAULT_SLIDER_SIZE = 10;

    // 总记录数
    private int total;

    // 结果集
    private List<?> results;

    // 当前页
    private int pageNo;

    // 每页显示多少条
    private int pageSize;

    // 设置默认值
    public PageModel() {
        this.pageNo = 1;
        this.pageSize = 10;
    }

    /**
     * @param pageNo     页数
     * @param pageSize   每页显示数量
     * @param results 数据
     */
    public PageModel(int pageNo, int pageSize, List<?> results) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.results = results;
    }

    public List<?> getResults() {
        return results;
    }

    /**
     * 取得下一页
     *
     * @return
     */
    public int getNextPageNo() {
        if (pageNo >= getTotalPages()) {
            return getTotalPages() == 0 ? 1 : getTotalPages();
        }
        return pageNo + 1;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    /**
     * 取得上一页
     *
     * @return
     */
    public int getPreviousPageNo() {
        if (pageNo <= 1) {
            return 1;
        }
        return pageNo - 1;
    }

    public int getTotalPages() {
        return (total + pageSize - 1) / pageSize;
    }

    // 总记录数
    public int getTotal() {
        return total;
    }

    public void setResults(List<?> results) {
        this.results = results;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotal(int total) {
        int totalPage = total / pageSize;
        if (total % pageSize != 0 || totalPage == 0) {
            totalPage++;
        }
        if (totalPage <= pageNo) {
            pageNo = totalPage;
        }
        if (pageNo <= 0) {
            pageNo = 1;
        }
        this.total = total;
    }

    public int getStart() {
        if (pageNo > 0) {
            return (this.pageNo - 1) * this.pageSize;
        }
        return this.pageNo * this.pageSize;
    }


    /**
     * 取得默认大小(<code>DEFAULT_SLIDER_SIZE</code>)的页码滑动窗口，并将当前页尽可能地放在滑动窗口的中间部位。
     * 参见{@link #getSlider(int n)}。
     *
     * @return 包含页码的数组
     */
    public int[] getSliderPage() {
        return getSlider(DEFAULT_SLIDER_SIZE);
    }

    /**
     * 功能：设置滑动窗口默认的大小
     *
     * @param size
     */
    public void setSpliderPage(int size) {
        DEFAULT_SLIDER_SIZE = size;
    }

    /**
     * 取得指定大小的页码滑动窗口，并将当前页尽可能地放在滑动窗口的中间部位。例如: 总共有13页，当前页是第5页，取得一个大小为5的滑动窗口，将包括
     * 3，4，5，6, 7这几个页码，第5页被放在中间。如果当前页是12，则返回页码为 9，10，11，12，13。
     *
     * @param width 滑动窗口大小
     * @return 包含页码的数组，如果指定滑动窗口大小小于1或总页数为0，则返回空数组。
     */
    public int[] getSlider(int width) {
        int pages = getTotalPages();

        if ((pages < 1) || (width < 1)) {
            return new int[0];
        } else {
            if (width > pages) {
                width = pages;
            }

            int[] slider = new int[width];
            int first = pageNo - ((width - 1) / 2);

            if (first < 1) {
                first = 1;
            }

            if (((first + width) - 1) > pages) {
                first = pages - width + 1;
            }

            for (int i = 0; i < width; i++) {
                slider[i] = first + i;
            }

            return slider;
        }
    }
}
