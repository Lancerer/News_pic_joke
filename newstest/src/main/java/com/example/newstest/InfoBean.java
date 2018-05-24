package com.example.newstest;

import android.util.Log;

import java.util.List;

/**
 * Created by Lancer on 2018/4/7.
 */

public class InfoBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-11-18 09:37","title":"微软发布Win10更新：都有什么改变和新功能","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/9e449000dad14cbfabf6db5f34eed6b720161118093615.jpeg","url":"http://tech.163.com/16/1118/09/C655MRH800097U7T.html"},{"ctime":"2016-11-18 09:33","title":"特斯拉SolarCity合并获股东批准 交易几天内完成","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/5/59/595131983d3e1ea953ddf743110ac6f9.jpg","url":"http://tech.163.com/16/1118/09/C655F4IU00097U7T.html"},{"ctime":"2016-11-18 17:13","title":"MacBook太贵？还有这些Windows笔记本让你挑","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/32387553390b488684517ee9fc1fd78420161118170943.jpeg","url":"http://tech.163.com/16/1118/17/C65VP44T00097U7T.html"},{"ctime":"2016-11-18 18:54","title":"中兴:美国出口禁令获进一步延期至2017年2月27日","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/32387553390b488684517ee9fc1fd78420161118170943.jpeg","url":"http://tech.163.com/16/1118/18/C665ICTS00097U7T.html"},{"ctime":"2016-11-19 07:29","title":"中消协：空气净化器并不是越贵越好","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/32387553390b488684517ee9fc1fd78420161118170943.jpeg","url":"http://tech.163.com/16/1119/07/C67GO46A00097U7T.html"},{"ctime":"2016-11-19 09:40","title":"机器人保安墓地\u201c上岗\u201d，为女子守墓队员壮胆","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/6/6e/6e9ac4740f5d2276658e02dafa683b5c.jpg","url":"http://tech.163.com/16/1119/09/C67O7HVQ00097U7T.html"},{"ctime":"2016-11-19 09:30","title":"苹果雇佣前WSJ记者顾蔚担任中国区公共关系主管","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/1/1a/1a3741cabd0402e132d89555ad2633fe.jpg","url":"http://tech.163.com/16/1119/09/C67NLF5F00097U7T.html"},{"ctime":"2016-11-19 10:51","title":"消息称英特尔对可穿戴设备部门大幅裁员","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/c170ce7a4754444e9dd4128eed71b4d520161119105207.jpeg","url":"http://tech.163.com/16/1119/10/C67SA8MA00097U7T.html"},{"ctime":"2016-11-19 12:31","title":"无人机驾考学费过万，还需掌握数学和物理基础","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/3/34/346d0854df49ef55cbaf01b563988559.jpg","url":"http://tech.163.com/16/1119/12/C682209200097U7T.html"},{"ctime":"2016-11-20 12:22","title":"微软把编程工具带到Mac 吸引早先流失的程序员","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/7/7c/7c9d09c52996ae9444a6c6b4afac11b4.png","url":"http://tech.163.com/16/1120/12/C6AJSV8V00097U7T.html"}]
     */

    private int code;
    private String msg;

    public void show() {
        Log.d("rejava的code", String.valueOf(code));
        Log.d("rejava的msg", msg);
    }

    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2016-11-18 09:37
         * title : 微软发布Win10更新：都有什么改变和新功能
         * description : 网易IT
         * picUrl : http://cms-bucket.nosdn.127.net/9e449000dad14cbfabf6db5f34eed6b720161118093615.jpeg
         * url : http://tech.163.com/16/1118/09/C655MRH800097U7T.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
