package com.example.lancer.mvp_news.bean;

import java.util.List;

/**
 * Created by Lancer on 2018/4/9.
 */

public class PeBean {
    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-05-03 10:56","title":"丁俊晖：整个赛季还算圆满 证明亚洲人也能打长局","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2016_19/0aa72c2918f3963_size69_w561_h120.jpg","url":"http://sports.ifeng.com/a/20160503/48662620_0.shtml"},{"ctime":"2016-05-03 11:27","title":"马德里赛女单前3号种子均出局 科维托娃跻身16强","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2016_19/e42ae048cbf64fc_size135_w426_h594.jpg","url":"http://sports.ifeng.com/a/20160503/48663048_0.shtml"},{"ctime":"2016-05-03 12:00","title":"马德里赛-阿扎横扫晋级16强 伊万惨遭逆转出局","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/cmpp/2016/05/03/15bae3ea1f3c71b72cf43a1a6b7e19a0_size298_w500_h350.jpg","url":"http://sports.ifeng.com/a/20160503/48663009_0.shtml"},{"ctime":"2016-05-03 12:12","title":"奥运圣火5月3号在巴西传递 被弹劾总统出席仪式","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p2.ifengimg.com/a/2016_19/e248364ecf185a3_size16_w527_h300.jpg","url":"http://sports.ifeng.com/a/20160503/48663636_0.shtml"},{"ctime":"2016-05-03 14:00","title":"妻子透露丁俊晖世锦赛瘦8斤 赞其永远都是最棒的","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p1.ifengimg.com/a/2016_19/8174fac2a7e0f75_size32_w400_h502.jpg","url":"http://sports.ifeng.com/a/20160503/48663481_0.shtml"},{"ctime":"2016-05-03 14:03","title":"15岁日本乒乓天才少女放豪言：中国选手容易打","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p2.ifengimg.com/a/2016_19/db58c142bbfa002_size51_w572_h318.jpg","url":"http://sports.ifeng.com/a/20160503/48664324_0.shtml"},{"ctime":"2016-05-03 17:21","title":"闪电博尔特获《时代》杂志年度百大最具影响力人物","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/a/2016_19/d1320b6acefb0b6_size11_w330_h220.jpg","url":"http://sports.ifeng.com/a/20160503/48667158_0.shtml"},{"ctime":"2016-05-03 18:00","title":"朴泰桓下跪给韩泳协出难题 要面子还是看成绩？","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2016_19/a4e4fd339e10db6_size18_w492_h326.jpg","url":"http://sports.ifeng.com/a/20160503/48664896_0.shtml"},{"ctime":"2016-05-03 18:00","title":"丁俊晖世锦赛摘银结束低谷 奖金丰厚收视率居首","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p2.ifengimg.com/a/2016_19/db58c142bbfa002_size51_w572_h318.jpg","url":"http://sports.ifeng.com/a/20160503/48664893_0.shtml"},{"ctime":"2016-05-03 18:26","title":"7成韩国人支持朴泰桓参加奥运：功大于过该给机会","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p1.ifengimg.com/a/2016_19/1382353f6c8aa11_size25_w219_h459.jpg","url":"http://sports.ifeng.com/a/20160503/48667913_0.shtml"}]
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
         * ctime : 2016-05-03 10:56
         * title : 丁俊晖：整个赛季还算圆满 证明亚洲人也能打长局
         * description : 凤凰体育
         * picUrl : http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2016_19/0aa72c2918f3963_size69_w561_h120.jpg
         * url : http://sports.ifeng.com/a/20160503/48662620_0.shtml
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
