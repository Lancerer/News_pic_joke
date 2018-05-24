package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/9.
 */

public class SoldierBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-05-03 08:10","title":"致敬，那些永不磨灭的番号","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170503/001aa0bce2741a73667758.jpg","url":"http://military.china.com.cn/2017-05/03/content_40734729.htm"},{"ctime":"2017-05-01 11:00","title":"中国海军远航访问编队抵达菲律宾进行友好访问","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170501/7427ea210a4d1a70ead60f.jpg","url":"http://military.china.com.cn/2017-05/01/content_40723949.htm"},{"ctime":"2017-05-01 10:24","title":"以色列：阵亡将士纪念日","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170501/7427ea210a4d1a70e33445.jpg","url":"http://military.china.com.cn/2017-05/01/content_40723766.htm"},{"ctime":"2017-05-07 08:26","title":"武警部队配发贝雷帽 盘点这些年武警换过的军装","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170507/001aa0bce2741a78b01d2b.jpg","url":"http://military.china.com.cn/2017-05/07/content_40761360.htm"},{"ctime":"2017-05-17 08:09","title":"最多停8艘潜艇！军迷拍冷战秘密基地","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170517/001aa0bce2741a85db4627.jpg","url":"http://military.china.com.cn/2017-05/17/content_40831086.htm"},{"ctime":"2017-05-18 10:50","title":"近距离看武直19E：短时间发射十几发火箭弹","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170518/001aa0bce2741a87514e36.jpg","url":"http://military.china.com.cn/2017-05/18/content_40841355.htm"},{"ctime":"2017-05-24 08:02","title":"海军舰徽大全 找找代表你城市的军舰舰徽什么模样？","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170524/001aa0bce2741a8f148e50.jpg","url":"http://military.china.com.cn/2017-05/24/content_40878058.htm"},{"ctime":"2017-05-25 10:10","title":"美最强战列舰！中国军迷参观依阿华号","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170525/001aa0bce2741a90841535.jpg","url":"http://military.china.com.cn/2017-05/25/content_40887810.htm"},{"ctime":"2017-08-24 14:27","title":"\u201c跨越\u20142017·朱日和\u201d演习拉开战幕","description":"军事图集","picUrl":"http://images.china.cn/attachement/png/site1000/20170824/b8aeed9906a41b08b8b216.png","url":"http://military.china.com.cn/2017-08/24/content_41468159.htm"},{"ctime":"2017-08-01 18:13","title":"东海舰队机关举行纪念建军90周年隆重升国旗仪式","description":"军事图集","picUrl":"http://images.china.cn/attachement/jpg/site1000/20170801/6c0b840a1faf1aea99b70e.jpg","url":"http://military.china.com.cn/2017-08/01/content_41328700.htm"}]
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
         * ctime : 2017-05-03 08:10
         * title : 致敬，那些永不磨灭的番号
         * description : 军事图集
         * picUrl : http://images.china.cn/attachement/jpg/site1000/20170503/001aa0bce2741a73667758.jpg
         * url : http://military.china.com.cn/2017-05/03/content_40734729.htm
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
