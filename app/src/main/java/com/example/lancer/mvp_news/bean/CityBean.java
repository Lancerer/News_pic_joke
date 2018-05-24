package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/9.
 */

public class CityBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2015-12-30 19:39","title":"菲律宾抢搭亚投行创始成员国\u201c末班车\u201d","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20151230/Img433062280.jpg","url":"http://news.sohu.com/20151230/n433072277.shtml"},{"ctime":"2015-12-30 19:14","title":"巴基斯坦安保人员打死16名恐怖分子","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20151230/Img433052331.jpeg","url":"http://news.sohu.com/20151230/n433071290.shtml"},{"ctime":"2015-12-30 18:37","title":"俄总理批准土耳其公司在俄被禁止活动种类清单","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433068826.shtml"},{"ctime":"2015-12-30 17:42","title":"伊朗距离美航母1500码处试射火箭 美称其挑衅","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433064281.shtml"},{"ctime":"2015-12-30 17:28","title":"中方：热烈祝贺几内亚埃博拉疫情结束","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433063323.shtml"},{"ctime":"2015-12-30 17:12","title":"日媒称提供10亿日元前提为搬迁少女像 日官员否认","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433062029.shtml"},{"ctime":"2015-12-30 17:11","title":"印尼明年发展十大景区已向84国游客提供免签证","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433062279.shtml"},{"ctime":"2015-12-30 17:11","title":"调查显示逾半数澳大利亚人不希望本国人口增长","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433062234.shtml"},{"ctime":"2015-12-30 17:04","title":"受大雪影响 142趟往返伊斯坦布尔航班被取消","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433061223.shtml"},{"ctime":"2015-12-30 17:03","title":"韩士兵在韩朝边境非军事区巡逻时身亡 身上有枪伤","description":"搜狐国际","picUrl":"","url":"http://news.sohu.com/20151230/n433060644.shtml"}]
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
         * ctime : 2015-12-30 19:39
         * title : 菲律宾抢搭亚投行创始成员国“末班车”
         * description : 搜狐国际
         * picUrl : http://photocdn.sohu.com/20151230/Img433062280.jpg
         * url : http://news.sohu.com/20151230/n433072277.shtml
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
