package cn.rjxy.mypet.util;

import com.github.pagehelper.PageInfo;

public class ResultPage extends Result{

    private PageInfo pageInfo;

    public ResultPage(int state, String msg) {
        super(state, msg);
    }

    public ResultPage(int state, String msg, Object data) {
        super(state, msg, data);
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
