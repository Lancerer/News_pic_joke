package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/8.
 */

public class picBean {
    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-09-16 14:00","title":"窗前","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/16/12/2017091612303791-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8020268-0-1.html"},{"ctime":"2017-09-16 14:00","title":"青春年华-90","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/16/12/20170916122631191-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8020265-0-1.html"},{"ctime":"2017-09-16 18:00","title":"美女下厨房","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/16/16/201709161630231261-2240800.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8020503-0-1.html"},{"ctime":"2017-09-17 01:00","title":"遛狗的漂亮妹纸[09P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/16/23/201709162358286731-2497165.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8020821-0-1.html"},{"ctime":"2017-09-17 12:00","title":"田园牧歌","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/17/11/201709171108333741-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8021050-0-1.html"},{"ctime":"2017-09-17 12:00","title":"倾听","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/17/11/201709171106024291-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8021049-0-1.html"},{"ctime":"2017-09-17 17:00","title":"云合镇王文华：秋的感慨，你可曾听说？","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/17/16/201709171624554921-4811557.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8021257-0-1.html"},{"ctime":"2017-09-18 11:00","title":"[贴图]短裤靓女","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/18/09/201709180942357781-4217076.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8021897-0-1.html"},{"ctime":"2017-09-18 17:00","title":"青春年华-91","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/18/07/201709180709362931-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8021681-0-1.html"},{"ctime":"2017-09-19 15:00","title":"白裙模特","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-09/19/09/201709190909592311-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-8023923-0-1.html"}]
     */

    private int code;
    private String msg;
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
         * ctime : 2017-09-16 14:00
         * title : 窗前
         * description : 华声美女
         * picUrl : http://image.hnol.net/c/2017-09/16/12/2017091612303791-239867.jpg
         * url : http://bbs.voc.com.cn/mm/meinv-8020268-0-1.html
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
