package com.donggua.test.testproject06.domain;

import com.github.pagehelper.PageInfo;

public class Response {

    public PageInfo<MemberInfo> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<MemberInfo> pageInfo) {
        this.pageInfo = pageInfo;
    }

    private PageInfo<MemberInfo> pageInfo;

    public static Response success(PageInfo<MemberInfo> pageInfo) {
        Response response = new Response();
        response.setPageInfo(pageInfo);
        return response;
    }

}
